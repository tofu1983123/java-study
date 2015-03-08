/*
	验证哥德巴赫猜想：任何一个大于6的偶数，都能分解成两个质数的和。要求输入一个整数，
	输出这个整数能被分解成哪两个质数的和。eg：14 14 = 3 + 11，14 = 7 + 7.
*/
import java.util.Scanner;
class Homework1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int a = s.nextInt();
		printPrime(a);
	}
	public static void printPrime(int n){
		if(n < 6){
			System.out.println("请输入一个大于等于6的整数!");
		}
		else if(n >5 && isEven(n)){
			int a = 3,b = 3;//存放两个质数
			for(int i = 3;i <= n/2;i += 2){
				a = i;
				b = n - i;
				if(isPrime(b) && a + b == n){
					System.out.println(n+" = "+a+" + "+b);
				}
			}
		}else{
			System.out.println("请输入一个大于等于6的偶数!");
		}
	}
	public static boolean isEven(int n){//判断是否为偶数
		if(n % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	/*public static boolean isPrime(int n){//判断是否为质数
		int i;
		for(i = 2;i <= n/2;i++){
			if(n % i == 0)
				break;
		}
		if(i > n/2){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isPrime(int n){
		boolean bool;
        for(int i = 3;i < 100;i+=2) {
            bool = true;
            for(int j = 3;j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    bool = false;
 　　　　　　　		break;
				}
			}
		}
		return bool;
	}
	*/
	public static boolean isPrime(int n){//判断是否为质数
		if(n <= 3){
			return n > 1;
		}else if(n % 2 == 0 || n % 3 == 0){
			return false;
		}else{
			for(int i = 5;i * i <= n;i += 6){
				if(n % i == 0 || n % (i + 2) == 0){
					return false;
				}
			}
			return true;
		}
	}
}
