import java.util.Scanner;
class IfDemo5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("����������:");
		int age = s.nextInt();
		if(age < 60)
		{
			System.out.println("���Ծ���Ʊ");
		}else{
			System.out.println("����Ҫ��Ʊ,ֱ�ӽ���!");
		}
	}
}
