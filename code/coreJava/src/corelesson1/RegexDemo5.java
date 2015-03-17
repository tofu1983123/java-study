package corelesson1;

import java.util.Scanner;

public class RegexDemo5 {
	/*常用的正则表达式都可以从网络中搜索到,不一定都要自己去写
	 * 必须认识正则表达式
	 * 我现在定义一个邮箱
	 * cedar_c@163.com  (.com.cn) cedar_c@sina.com.cn
	 * 假设:名字是数字字母_都可以后面跟@
	 * @后面是数字字母
	 * 再后面(.字母)一个或多个
	 * */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String regex = "^\\w+@[a-zA-z0-9]+(\\.[a-zA-Z]+)+$";
		while(true){
			System.out.println("请输入邮箱:");
			String t = s.nextLine();
			if(t.matches(regex)){
				System.out.println(t);
				break;
			}
			System.out.println("输入的邮箱不合法请重新输入!");
		}
	}

}
