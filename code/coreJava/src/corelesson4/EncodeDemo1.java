package corelesson4;

import java.io.UnsupportedEncodingException;

public class EncodeDemo1 {

	public static void main(String[] args) {
		/*java语言内部一个字符占两个字节,不管是中文英文*/
		String s = "ABC沃";
		byte[] b = s.getBytes();//默认会用项目的编码进行转换
		for (byte c : b) {
			System.out.print(Integer.toHexString(c & 0xFF) + " ");//c &表示将前面的0都去掉,只留下后8位
		}
		System.out.println("\n1========================");
		try {
			byte[] b1 = s.getBytes("GBK");
			for (byte c : b1) {
				System.out.print(Integer.toHexString(c & 0xFF) + " ");
			}
			//GBK编码一个英文占用1个字节,一个中文占用2个字节
			System.out.println("\n2========================");	
			byte[] b2 = s.getBytes("utf-8");
			for (byte c : b2) {
				System.out.print(Integer.toHexString(c & 0xFF) + " ");
			}
			//utf-8编码一个英文占用1个字节,一个中文占用3个字节
			System.out.println("\n3========================");
			byte[] b3 = s.getBytes("utf-16be");
			for (byte c : b3) {
				System.out.print(Integer.toHexString(c & 0xFF) + " ");
			}
			System.out.println();
			//String ss = new String(b1);//默认项目编码
			String ss = new String(b1,"gbk");
			String ss1 = new String(b1,"utf-8");
			System.out.println(ss);
			System.out.println(ss1);//乱码
			String ss2 = new String(b2);
			System.out.println(ss2);//乱码
			String ss3 = new String(b2,"utf-8");
			System.out.println(ss3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
