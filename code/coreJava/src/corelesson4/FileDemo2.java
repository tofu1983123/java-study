package corelesson4;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {

	public static void main(String[] args) {
		File file = new File("D:\\java\\linshi\\lesson2");
		//listFile(file);
		//listFile1(file);
		listFile2(file);
	}
	public static void listFile(File file){
		//该目录下所有的目录名和文件名,不会列出整个目录名称,也不会遍历子目录.
		String[] filenames = file.list();
		for (String string : filenames) {
			//System.out.println(string);
			System.out.println(file.getAbsolutePath() + "\\" + string);
		}
		System.out.println("====================");
		//直接列出目录下的,产生的是File对象
		File[] files = file.listFiles();
		for (File file2 : files) {
			System.out.println(file2.getAbsolutePath());
		}
	}
	/*
	 * */
	public static void listFile1(File file){
		File[] files = file.listFiles();
		for(File file2 : files){
			if(file2.isFile()){//如果是文件
				System.out.println(file2.getAbsolutePath());
			}else if(file2.isDirectory()){//如果是目录,递归调用
				listFile1(file2);
			}
		}
	}
	public static void listFile2(File file){
		//String[] filenames = file.list(new MyFileNameFilter());
		String[] filenames = file.list(new FilenameFilter(){
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}			
		});
		for (String string : filenames) {
			System.out.println(file.getAbsolutePath()+ "/" + string);
		}
	}
	static class MyFileNameFilter implements FilenameFilter{
		//file列出的每个文件都要调用accept方法,返回true留下,false被过滤
		public boolean accept(File dir, String name) {
			//File dir代表父目录  name代表直接子的名字,文件名or目录
			//System.out.println(dir.getAbsolutePath()+"..."+name);
			return name.endsWith(".java");
			//return !name.endsWith(".java");
		}
		
	}
}
