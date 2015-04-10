package corelesson4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class RWDemo4 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream("D:\\java\\linshi\\1.txt")));
			//PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\java\\linshi\\2.txt"));
			PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\java\\linshi\\2.txt"),true);//自动刷新缓冲区
			String str = null;
			while((str = br.readLine())!= null){
				System.out.println(str);
				pw.println(str);
			}
			br.close();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
