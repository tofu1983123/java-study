package corelesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) {
		try {
			//开启服务
			ServerSocket s = new ServerSocket(9000);
			System.out.println("服务已经开启,等待客户端访问");
			Socket socket = s.accept();
			System.out.println("接收到 "+socket.getInetAddress().getHostAddress()+" 客户端的访问");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			while(true){
				String str = br.readLine();
				System.out.println(str);
				String str1 = br1.readLine();
				out.println(str1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
