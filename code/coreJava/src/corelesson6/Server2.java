package corelesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

	public static void main(String[] args) {
		try {
			//��������
			ServerSocket s = new ServerSocket(9000);
			System.out.println("�����Ѿ�����,�ȴ��ͻ��˷���");
			while(true){
				Socket socket = s.accept();
				System.out.println("���յ� "+socket.getInetAddress().getHostAddress()+" �ͻ��˵ķ���");
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
				
				new ReadThread(br).start();
				new WriterThread(br1,out).start();
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
