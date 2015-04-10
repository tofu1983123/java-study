package corelesson4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo1 {

	public static void main(String[] args) {
		//test1();
		//test2();
		test3();
		//test4();
	}

	// ���е�IO��������IOException����
	public static void test1() {
		try {
			FileInputStream in = new FileInputStream(
					"D:\\java\\java-study\\trunk\\code\\coreJava\\src\\lesson2\\User.java");
			//���1.txt������ֱ�Ӵ���,���ڻ�ɾ����Ȼ���ٴ���			
			FileOutputStream out  = new FileOutputStream("d:\\1.txt");
			
			int c;
			/*
			 * ����1:���ڵ��ֽڱ����ַ�û������, ����һ���ַ�ռ�ö���ֽڵ����ִ�ӡ������� ����2:���ڱȽϴ���ļ�,��ȡЧ�ʱȽϵ�
			 */
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
				out.write(c);
			}
			in.close();// �����finally��ȥ�ر�
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void test2() {
		try {
			FileInputStream in = new FileInputStream(
					"D:\\java\\java-study\\trunk\\code\\coreJava\\src\\lesson2\\User.java");
			FileOutputStream out  = new FileOutputStream("d:\\2.txt");
			byte[] b = new byte[1024 * 5];
			//��b�ֽ������з�,�ӵ�0��λ�ÿ�ʼ��,����b.length��,���ص��Ƕ�ȡ���ֽڵĸ���
			/*int bytes = in.read(b,0,b.length);//������ȡ,Ч�ʽϸ�
			String s = new String(b,0,bytes);
			System.out.println(s);*/
			//long start = System.currentTimeMillis();
			int bytes;
			//��ȡ����ļ�����ʹ�����ַ�ʽ
			while((bytes = in.read(b,0,b.length)) != -1){
				String s = new String(b,0,bytes);
				System.out.println(s);
				out.write(b,0,bytes);
			}
			//long end = System.currentTimeMillis();
			//System.out.println(end - start);
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void test3(){
		try {
			FileInputStream in = new FileInputStream(
					"D:\\java\\java-study\\trunk\\code\\coreJava\\src\\lesson2\\User.java");
			FileOutputStream out  = new FileOutputStream("d:\\3.txt");
			int length = in.available();//���ؿɶ����ֽ���
			/*
			 * ����ļ��ܴ�,���ٵ��ڴ�ռ��̫����,Ҳ������
			 * ���鶼��test2�����еķ�ʽ��ȡ�ļ�
			 * */
			byte[] b = new byte[length];
			in.read(b);
			String s = new String(b);
			System.out.println(s);
			out.write(b);
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void test4(){
		try {
			FileInputStream in = new FileInputStream(
					"D:\\java\\java-study\\trunk\\code\\coreJava\\src\\lesson2\\aa.txt");
			FileOutputStream out  = new FileOutputStream("d:\\bb.txt");
			/*
			 * aa.txt�ļ���utf-8������ֽ�����,ת�����ַ���ʱҪ��utf-8
			 * */
			byte[] b = new byte[1000];
			int bytes = in.read(b,0,b.length);
			String s = new String(b,0,bytes,"utf-8");
			System.out.println(s);
			out.write(b,0,bytes);
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
