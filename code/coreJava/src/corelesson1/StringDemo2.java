package corelesson1;

public class StringDemo2 {

	public static void main(String[] args) {
		String s = "helloworld";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println("1===================");
		for(int i = 0;i < s.length();i++){
			System.out.print(s.charAt(i));			
		}
		System.out.println();
		System.out.println("2===================");
		String s2 = "cedar_c@163.com";
		System.out.println(s2.endsWith(".com"));
		System.out.println("3===================");
		System.out.println(s2.substring(1));
		System.out.println(s2.substring(1,4));//包含1,不包含4
		System.out.println("4===================");
		System.out.println(s2.indexOf("@"));
		System.out.println(s2.lastIndexOf("@"));
		System.out.println(s2.indexOf("78"));//不存在返回-1
		//获取邮箱中的用户名 从@开始前面的是用户名
		int index = s2.indexOf("@");
		System.out.println(s2.substring(0,index));
		
		String name = "zhangsan";
		System.out.println(name.toUpperCase());
		
		String name1 = "LISI";
		System.out.println(name1.toLowerCase());
		
		//字符串内容是否相同,用equals
		System.out.println(name.equals(name1));
		System.out.println(name.equals("zhangsan"));
		System.out.println(name.equals("ZHANGSAN"));
		System.out.println(name.equalsIgnoreCase("ZHANGSAN"));
		
		//name变量的首字母转换成大写,其他不变
		String name2 = name.substring(0,1).toUpperCase() + name.substring(1);
		System.out.println(name2);
		
		System.out.println(name.concat(name2));//连接
		
		//比较,从第一个不相同的字符串开始比较,返回其ascii差值
		System.out.println(name.compareTo(name2));
		
		//转换成字符串
		int a = 100;
		//System.out.println(a+"");
		String s3 = String.valueOf(a);
		System.out.println(s3);
		
		System.out.println("5===================");
		//split分割
		String s4 = "a,b,c,d,e";
		String[] ss = s4.split(",");
		for (String string : ss) {
			System.out.println(string);
		}
	}

}
