package org.wyzc.elt.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.UUID;

import org.wyzc.elt.dao.EntityContext;
import org.wyzc.elt.entity.Request;
import org.wyzc.elt.entity.Response;
import org.wyzc.elt.service.ExamServiceImpl;
import org.wyzc.elt.util.ReadUtil;

public class MainServer {
	public static void main(String[] args) {
		MainServer mainServer = new MainServer();
		EntityContext entityContext  = new EntityContext();
		mainServer.setEntityContext(entityContext);
		mainServer.startServer();
	}
	private HashMap<String, ExamServiceImpl> services = new HashMap<String, ExamServiceImpl>();
	private EntityContext entityContext;
	public void setEntityContext(EntityContext entityContext) {
		this.entityContext = entityContext;
	}
	public void startServer() {
		try {
			int port = Integer.parseInt(ReadUtil.getMessage("port"));
			ServerSocket s = new ServerSocket(port);
			System.out.println("�����˷���ȴ��ͻ��˷���");
			while (true) {
				Socket socket = s.accept();
				new ExamThread(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private class ExamThread extends Thread {
		private Socket socket;

		public ExamThread(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			// 1.��ȡ����
			Request request = getRequest(socket);
			/*
			 * 2.����ҵ�����---->����ͬһ���û�,ÿ��ҵ�����ֻҪ����һ�� �������½֮������������������������Ҫ��ʶ������û�
			 * ��һ�ε�½�ɹ�ʱ����Ӧ���ͻ���һ����ʶ �´��ٷ�������ʱ �������ʶҲ���������͹���(������Ҫ��װ��ʶ) �����������ж�
			 * ҵ�����������ҵ��֮��,����Map���� ��ʶ��Ϊkey,ҵ�������Ϊvalue,Ҳʹ��ҵ����� ����ͬһ���û�ֻ����һ��
			 */
			ExamServiceImpl service = getService(request);

			Response response = new Response();
			response.setSessionId(request.getSessionId());
			// 3.����ҵ�񷽷�
			try {
				Object obj = invokeMethod(service, request);
				response.setObj(obj);
			} catch (Exception e) {
				response.setException(new RuntimeException(e.getMessage()));
			} finally {
				try {
					response.setSuccess();
					ObjectOutputStream oos = new ObjectOutputStream(
							socket.getOutputStream());
					// 4.д����Ӧ
					oos.writeObject(response);
					oos.flush();
					//oos.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}

		/**
		 * ��ȡ��������
		 * 
		 * @param socket
		 * @return
		 */
		private Request getRequest(Socket socket) {
			try {
				ObjectInputStream ois = new ObjectInputStream(
						socket.getInputStream());
				Request request = (Request) ois.readObject();
				//ois.close();
				return request;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}

		/**
		 * 
		 * @param sessionId
		 *            ����������Ӧ���ͻ��˵�Ψһ��ʶ
		 * @return
		 */
		private ExamServiceImpl getService(Request request) {
			String sessionId = request.getSessionId();
			if (sessionId == null) {
				// û�е�¼��
				sessionId = UUID.randomUUID().toString();
				request.setSessionId(sessionId);
				ExamServiceImpl service = new ExamServiceImpl();
				service.setEntityContext(entityContext);
				services.put(sessionId, service);
			}
			return services.get(sessionId);
		}

		private Object invokeMethod(ExamServiceImpl service, Request request)
				throws Exception {
			Class c = service.getClass();
			Object obj = null;
			try {
				// ��ȡҵ�񷽷�
				Method m = c.getMethod(request.getMethodName(),
						request.getParamTypes());
				// ����ҵ�񷽷�
				obj = m.invoke(service, request.getObj());
				return obj;
			} catch (InvocationTargetException e) {
				// ҵ�񷽷����ò������쳣
				throw new Exception(e.getTargetException().getMessage());
			} catch (Exception e) {
				throw e;
			}
		}
	}
}