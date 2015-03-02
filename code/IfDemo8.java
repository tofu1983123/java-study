import java.util.Scanner;
class IfDemo8
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("请输入考试成绩:");
		int score = s.nextInt();
		if(score > 100||score < 0)
			System.out.println("成绩输入不合法");
		else if(score>=90)//90到100
			System.out.println("成绩优秀");
		else if(score >= 80)
			System.out.println("成绩良好");
		else if(score>=70)
			System.out.println("成绩一般");
		else if(score>=60)
			System.out.println("成绩及格");
		else
			System.out.println("成绩不及格");
	}
}
