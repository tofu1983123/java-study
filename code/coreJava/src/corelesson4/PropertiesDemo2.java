package corelesson4;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			//·��д��֮��,�ᵼ����Ŀһ���ƶ�λ��,��Ҫ�޸Ĵ���.
			//prop.load(new FileInputStream("D:\\java\\java-study\\trunk\\code\\coreJava\\src\\corelesson4\\aa.properties"));
			//getResourceAsStream�õ�����classpath·��
			//prop.load(PropertiesDemo2.class.getResourceAsStream("/corelesson4/aa.properties"));
			prop.load(PropertiesDemo2.class.getClassLoader().getResourceAsStream("corelesson4/aa.properties"));;
			System.out.println(prop.getProperty("aa"));
			System.out.println(prop.getProperty("bb"));
			System.out.println(prop.getProperty("cc"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
