package corelesson1;

public class StringDemo1 {

	public static void main(String[] args) {
		//�ⲿ������Ҫ����ѧ��ͨ���鿴�����ĵ��еĹ��췽��
		char[] chars = {'a','b','c','d','e'};
		String s = new String(chars);
		System.out.println(s);
		String s1 = new String(chars,1,2);
		System.out.println(s1);
		
		String s2 = new String("helloworld");
		System.out.println(s2);
		
		//����Ĺ��췽ʽ,ֱ�Ӹ�ֵ
		String s3 = "hello";
		/*��Ϊ:�ַ�������or�ַ���������,ͨ�����캯��new��,
		 * һ��������µ��ڴ�ռ�,ͨ����ֵ�ķ�ʽ,��һ��������ڴ�ռ�
		 * ��ʵ��һ�����ģʽ,��Ϊ��Ԫģʽ	
		*/
		String s4 = "hello";
		System.out.println(s3 == s4);//��ӡ true
		/*
		 * ��Ϊ��һ���ַ����ص��ڴ�ռ�,������ַ�������
		 * ÿ��,�����ȴ��ַ����������Ƿ��иó�������
		 * �����ֱ������,���û��,�µĿռ�,Ȼ������
		 * */
		String s5 = "a" +"b"+"c";//ֱ�ӵĵȼ���"abc";jvm�Զ��Ż�
		String s6 = "abc";
		System.out.println(s5 == s6);//��ӡtrue
		
		String s7 = 1 + 2 + 3 + "abc";
		System.out.println(s7);//��ӡ6abc
		
		String s8 = "abc" + 1 + 2 + 3;
		System.out.println(s7);//��ӡabc123
		
		String s9 = "hello" +"world";
		String s10 = "helloworld";
		System.out.println(s9 == s10);//��ӡtrue
		
		String s11 = s4 + "world";//�൱��:new StringBuilder(s4).append("world");
		System.out.println(s10 == s11);//��ӡfalse
	}

}
