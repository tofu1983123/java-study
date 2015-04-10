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

	// 所有的IO操作都有IOException产生
	public static void test1() {
		try {
			FileInputStream in = new FileInputStream(
					"D:\\java\\java-study\\trunk\\code\\coreJava\\src\\lesson2\\User.java");
			//如果1.txt不存在直接创建,存在会删除后然后再创建			
			FileOutputStream out  = new FileOutputStream("d:\\1.txt");
			
			int c;
			/*
			 * 问题1:对于单字节编码字符没有问题, 对于一个字符占用多个字节的文字打印会出乱码 问题2:对于比较大的文件,读取效率比较低
			 */
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
				out.write(c);
			}
			in.close();// 最好在finally中去关闭
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
			//往b字节数组中放,从第0个位置开始做,最多放b.length个,返回的是读取的字节的个数
			/*int bytes = in.read(b,0,b.length);//批量读取,效率较高
			String s = new String(b,0,bytes);
			System.out.println(s);*/
			//long start = System.currentTimeMillis();
			int bytes;
			//读取大的文件建议使用这种方式
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
			int length = in.available();//返回可读的字节数
			/*
			 * 如果文件很大,开辟的内存空间就太大了,也不合适
			 * 建议都用test2方法中的方式读取文件
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
			 * aa.txt文件是utf-8编码的字节序列,转换成字符串时要用utf-8
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
