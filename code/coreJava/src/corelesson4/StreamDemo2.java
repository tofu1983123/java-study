package corelesson4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo2 {

	public static void main(String[] args) {
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\java\\linshi\\a.jpg"));
			//BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\java\\linshi\\b.jpg"));
			FileOutputStream bos = new FileOutputStream("D:\\java\\linshi\\c.jpg");
			/*
			 * �ڲ��������Ȱ��ļ����õ��ڴ���(�������ֽ�����)
			 * ���Ƕ���ʱ����ڴ��ж�ȡ
			 * */
			byte[] b = new byte[10000];
			int bytes;
			while((bytes = bis.read(b,0,b.length)) != -1){
				//��д�뻺����,ˢ�»������Ż�д�����,�����������Զ�ˢ��
				bos.write(b,0,bytes);
				//bos.flush();
			}
			bos.close();//closeҲ���Զ�ˢ��
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
