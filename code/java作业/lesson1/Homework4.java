/*
	��ҵ4:
	�����������ִӴ�С�������
*/
import java.util.Scanner;
class Homework4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a = s.nextInt();
		System.out.println("������ڶ�������:");
		int b = s.nextInt();
		System.out.println("���������������:");
		int c = s.nextInt();
		int t = 0;
		if(a < b){
			t = a;
			a = b;
			b = t;
		}//a b�д�ķ���a
		if(a < c){
			t = a;
			a = c;
			c = t;
		}//a b c�д�ķ���a
		if(b < c){
			t = b;
			b = c;
			c = t;
		}//b c�д�ķ���b,С�ķ���c
		System.out.println("���������ִӴ�С��˳��Ϊ:"+a+","+b+","+c);
	}
}