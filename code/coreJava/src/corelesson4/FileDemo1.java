package corelesson4;

import java.io.File;
import java.io.*;

public class FileDemo1 {

	public static void main(String[] args) {
		File file = new File("D:\\java\\java-study\\trunk\\code\\coreJava\\src\\corelesson4");
		System.out.println(file.exists());//ture代表目录存在,false代表不存在
		//File file1 = new File("D:\\java\\java-study\\trunk\\code\\coreJava\\src\\corelesson4\\aa");
		//File file1 = new File(file,"aa");
		File file1 = new File("D:\\java\\java-study\\trunk\\code\\coreJava\\src\\corelesson4","aa");
		if(!file1.exists())
			file1.mkdir();//创建目录
		else
			file1.delete();//删除目录
		System.out.println(file1.isDirectory());//判断是否是一个目录,如果目录不存在,该方法也返回false
		System.out.println(file1.isFile());//判断是否是一个文件
		System.out.println("====================");
		File file2 = new File("D:\\java\\java-study\\trunk\\code\\coreJava\\src\\corelesson4\\EncodeDemo1.java");
		System.out.println(file2.isFile());
		System.out.println(file2.exists());
		/*File file3 = new File(file,"1.txt");
		if(!file3.exists())
			try {
				file3.createNewFile();//创建文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		else
			file3.delete();//删除文件
		*/
		System.out.println("====================");
		System.out.println(file.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println("====================");
		System.out.println(file.getName());
		System.out.println(file2.getName());
		System.out.println("====================");
		System.out.println(file.getParent());//得到父目录的字符串
		System.out.println(file2.getParent());
		System.out.println("====================");
		//getParentFile()得到父目录的File对象
		System.out.println(file.getParentFile().getAbsolutePath());
		System.out.println(file2.getParentFile().getAbsolutePath());
	}

}
