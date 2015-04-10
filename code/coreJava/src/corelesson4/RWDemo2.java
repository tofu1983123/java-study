package corelesson4;

import java.io.FileReader;
import java.io.FileWriter;

public class RWDemo2 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\java\\linshi\\1.txt");
			FileWriter fw = new FileWriter("D:\\java\\linshi\\2.txt");
			int chars;
			char[] c = new char[1000];
			while((chars = fr.read(c,0,c.length))!=-1){
				String s = new String(c,0,chars);
				System.out.print(s);
				fw.write(c,0,chars);
				fw.flush();
			}
			fr.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
