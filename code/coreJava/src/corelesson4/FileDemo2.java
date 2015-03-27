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
		//��Ŀ¼�����е�Ŀ¼�����ļ���,�����г�����Ŀ¼����,Ҳ���������Ŀ¼.
		String[] filenames = file.list();
		for (String string : filenames) {
			//System.out.println(string);
			System.out.println(file.getAbsolutePath() + "\\" + string);
		}
		System.out.println("====================");
		//ֱ���г�Ŀ¼�µ�,��������File����
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
			if(file2.isFile()){//������ļ�
				System.out.println(file2.getAbsolutePath());
			}else if(file2.isDirectory()){//�����Ŀ¼,�ݹ����
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
		//file�г���ÿ���ļ���Ҫ����accept����,����true����,false������
		public boolean accept(File dir, String name) {
			//File dir����Ŀ¼  name����ֱ���ӵ�����,�ļ���orĿ¼
			//System.out.println(dir.getAbsolutePath()+"..."+name);
			return name.endsWith(".java");
			//return !name.endsWith(".java");
		}
		
	}
}
