/*
	��ҵ2:
	����һ����λ��,�������λ����֮��.
	����:123��λ����֮��Ϊ6.
*/
import java.util.Scanner;
class Homework2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("������һ����λ��:");
		int num = s.nextInt();
		int sum = 0;
		if(num/100 > 0 && num/100 < 10){
			sum = num%10 + num/10%10 + num/100;
		}else{
			System.out.println("�������λ������!");
		}
		if(sum > 0)
			System.out.println("��λ����λ����֮��Ϊ:" + sum);
	}
}
