package corelesson1;

public class StringDemo1 {

	public static void main(String[] args) {
		//这部分内容要求大家学会通过查看帮助文档中的构造方法
		char[] chars = {'a','b','c','d','e'};
		String s = new String(chars);
		System.out.println(s);
		String s1 = new String(chars,1,2);
		System.out.println(s1);
		
		String s2 = new String("helloworld");
		System.out.println(s2);
		
		//特殊的构造方式,直接赋值
		String s3 = "hello";
		/*称为:字符串常量or字符串字面量,通过构造函数new的,
		 * 一定会产生新的内存空间,通过赋值的方式,不一定会产生内存空间
		 * 其实是一种设计模式,称为享元模式	
		*/
		String s4 = "hello";
		System.out.println(s3 == s4);//打印 true
		/*
		 * 认为有一个字符串池的内存空间,里面放字符串常量
		 * 每次,总是先从字符串池中找是否有该常量存在
		 * 如果有直接饮用,如果没有,新的空间,然后引用
		 * */
		String s5 = "a" +"b"+"c";//直接的等价于"abc";jvm自动优化
		String s6 = "abc";
		System.out.println(s5 == s6);//打印true
		
		String s7 = 1 + 2 + 3 + "abc";
		System.out.println(s7);//打印6abc
		
		String s8 = "abc" + 1 + 2 + 3;
		System.out.println(s7);//打印abc123
		
		String s9 = "hello" +"world";
		String s10 = "helloworld";
		System.out.println(s9 == s10);//打印true
		
		String s11 = s4 + "world";//相当于:new StringBuilder(s4).append("world");
		System.out.println(s10 == s11);//打印false
	}

}
