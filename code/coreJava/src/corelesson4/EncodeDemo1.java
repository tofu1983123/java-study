package corelesson4;

import java.io.UnsupportedEncodingException;

public class EncodeDemo1 {

	public static void main(String[] args) {
		/*java�����ڲ�һ���ַ�ռ�����ֽ�,����������Ӣ��*/
		String s = "ABC��";
		byte[] b = s.getBytes();//Ĭ�ϻ�����Ŀ�ı������ת��
		for (byte c : b) {
			System.out.print(Integer.toHexString(c & 0xFF) + " ");//c &��ʾ��ǰ���0��ȥ��,ֻ���º�8λ
		}
		System.out.println("\n1========================");
		try {
			byte[] b1 = s.getBytes("GBK");
			for (byte c : b1) {
				System.out.print(Integer.toHexString(c & 0xFF) + " ");
			}
			//GBK����һ��Ӣ��ռ��1���ֽ�,һ������ռ��2���ֽ�
			System.out.println("\n2========================");	
			byte[] b2 = s.getBytes("utf-8");
			for (byte c : b2) {
				System.out.print(Integer.toHexString(c & 0xFF) + " ");
			}
			//utf-8����һ��Ӣ��ռ��1���ֽ�,һ������ռ��3���ֽ�
			System.out.println("\n3========================");
			byte[] b3 = s.getBytes("utf-16be");
			for (byte c : b3) {
				System.out.print(Integer.toHexString(c & 0xFF) + " ");
			}
			System.out.println();
			//String ss = new String(b1);//Ĭ����Ŀ����
			String ss = new String(b1,"gbk");
			String ss1 = new String(b1,"utf-8");
			System.out.println(ss);
			System.out.println(ss1);//����
			String ss2 = new String(b2);
			System.out.println(ss2);//����
			String ss3 = new String(b2,"utf-8");
			System.out.println(ss3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
