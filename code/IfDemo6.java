import java.util.Scanner;
class IfDemo6 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("���������:");
		int year = s.nextInt();
		if(year%4 == 0 && year%100 != 0 || year%400 == 0)
			System.out.println(year + "��������");
		else
			System.out.println(year + "�겻������");
	}
}
