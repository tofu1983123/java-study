package corelesson4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RWDemo3 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream("D:\\java\\linshi\\1.txt")));
			// BufferedReader br1 = new BufferedReader(new FileReader(
			// "D:\\java\\linshi\\1.txt"));//br1��br�ǵȼ۵�
			// ��ͨ�Ķ���������,��Ҫ����readLine����
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("D:\\java\\linshi\\2.txt")));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);// һ�ζ�һ��,��ֱ�Ӷ�ȡ����,�Ժ���Ҫ�Լ�����
				bw.write(str, 0, str.length());
				bw.newLine();
				bw.flush();
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
