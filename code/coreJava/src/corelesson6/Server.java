package corelesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			//��������
			ServerSocket s = new ServerSocket(9000);
			System.out.println("�����Ѿ�����,�ȴ��ͻ��˷���");
			//�ȴ��ͻ�������---->���û�пͻ�����,�÷�������.
			Socket socket = s.accept();
			System.out.println("���յ� "+socket.getInetAddress().getHostAddress()+" �ͻ��˵ķ���");
			//��������ͨ��socket.getInputStream���ж�����,��Ҫת����һ�ζ�һ�еĲ���
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String str = br.readLine();
			System.out.println(str);
			//�ӷ������˼��̶�һ������,�����ͻ���
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			String str1 = br1.readLine();
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			out.println(str1);
			//socket.close();
			//s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
