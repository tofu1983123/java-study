import java.util.Scanner;
class IfDemo7
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("请输入考试成绩:");
		int score = s.nextInt();
		if(score > 100||score < 0)
			System.out.println("成绩输入不合法");
		if(score>=90&&score<=100)
			System.out.println("成绩优秀");
		if(score>=80&&score<90)
			System.out.println("成绩良好");
		if(score>=70&&score<80)
			System.out.println("成绩一般");
		if(score>=60&&score<70)
			System.out.println("成绩及格");
		if(score<60&&score>=0)
			System.out.println("成绩不及格");
	}
}
