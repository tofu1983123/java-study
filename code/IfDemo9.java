import java.util.Scanner;
class IfDemo9
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("����������:");
		int number = s.nextInt();
		if(number > 0)
			System.out.println(number + "������");
		else if(number < 0)
			System.out.println(number + "�Ǹ���");
		else
			System.out.println("������0");
	}
}