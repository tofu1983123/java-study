package corelesson1;

import java.util.Scanner;

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
		Scanner s = new Scanner(System.in);
		String regex = "^\\w+@[a-zA-z0-9]+(\\.[a-zA-Z]+)+$";
		while(true){
			System.out.println("����������:");
			String t = s.nextLine();
			if(t.matches(regex)){
				System.out.println(t);
				break;
			}
			System.out.println("��������䲻�Ϸ�����������!");
		}
	}

}
