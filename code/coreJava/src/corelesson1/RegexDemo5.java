package corelesson1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
	/*���õ�������ʽ�����Դ�������������,��һ����Ҫ�Լ�ȥд
	 * ������ʶ������ʽ
	 * �����ڶ���һ������
	 * cedar_c@163.com  (.com.cn) cedar_c@sina.com.cn
	 * ����:������������ĸ_�����Ժ����@
	 * @������������ĸ
	 * �ٺ���(.��ĸ)һ������
	 * */
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		String regex = "^\\w+@[a-zA-z0-9]+(\\.[a-zA-Z]+)+$";
//		while(true){
//			System.out.println("����������:");
//			String t = s.nextLine();
//			if(t.matches(regex)){
//				System.out.println(t);
//				break;
//			}
//			System.out.println("��������䲻�Ϸ�����������!");
//		}
		String a = "a";
		String a1 = "���";
		String a2 = "01_2222222";
		String a3 = "az_9999";
		if(zhanghao(a2))
			System.out.println(a2);
		if(zhanghao(a3))
			System.out.println(a3);
//		if(zhongwen(a))
//			System.out.println(a);
//		if(zhongwen(a))
//			System.out.println(a);
	}
	public static boolean zhongwen(String str){
		String regex = "[\u4E00-\u9FA5]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()){
			System.out.println(matcher.group());
			return true;
		}
		return false;
	}
	public static boolean zhanghao(String str){
		String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,15}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()){
			System.out.println(matcher.group());
			return true;
		}
		return false;
	}
}
