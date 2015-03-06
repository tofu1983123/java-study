import java.util.Scanner;
class FunDemo2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入第一个数字:");
		int x1 = s.nextInt();
		//打印x1的因子 ===>打印因子已经写成了函数,直接调用即可
		printSons(x1);//调用函数
		System.out.println("请输入第二个数字:");
		int x2 = s.nextInt();
		//打印x2的因子,---->打印因子,直接调用函数即可
		printSons(x2);
		System.out.println("请输入第三个数字:");
		int x3 = s.nextInt();
		//打印x3的因子,---->打印因子,直接调用函数即可
		printSons(x3);
	}
	public static void printSons(int a){
		//变成了打印a的因子
		for(int i = 1;i < a/2;i++){
			if(a%i == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
