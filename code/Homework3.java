/*
	��ҵ3:
	����һ��������,����һ�껹ʣ�¶�����
	(��ʾ:������ �C �Ѿ�����)
*/
import java.util.Scanner;
class Homework3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("��������:");
		int y = s.nextInt();
		System.out.println("��������:");
		int m = s.nextInt();
		System.out.println("��������:");
		int d = s.nextInt();
		int sumday = 365;//������һ�깲��365��.
		int sum = 0;
		switch (m-1)
		{
		case 11:
			sum += 30;
		case 10:
			sum += 31;
		case 9:
			sum += 30;
		case 8:
			sum += 31;
		case 7:
			sum += 31;
		case 6:
			sum += 30;
		case 5:
			sum += 31;
		case 4:
			sum += 30;
		case 3:
			sum += 31;
		case 2:
			if(y%4==0&&y%100!=0||y%400==0){
				sum += 29;
				sumday = 366;
			}else{
				sum += 28;
				sumday = 365;
			}
		case 1:
			sum += 31;
		}
		sum += d;
		//System.out.println("��һ���ȥ������Ϊ:"+sum+"��");
		sum = sumday - sum;
		System.out.println("��һ�껹ʣ�µ�����Ϊ:"+sum+"��");
	}
}