/*
	��֤��°ͺղ��룺�κ�һ������6��ż�������ֽܷ�����������ĺ͡�Ҫ������һ��������
	�����������ܱ��ֽ�������������ĺ͡�eg��14 14 = 3 + 11��14 = 7 + 7.
*/
import java.util.Scanner;
class Homework1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("������һ������:");
		int a = s.nextInt();
		printPrime(a);
	}
	public static void printPrime(int n){
		if(n < 6){
			System.out.println("������һ�����ڵ���6������!");
		}
		else if(n >5 && isEven(n)){
			int a = 3,b = 3;//�����������
			for(int i = 3;i <= n/2;i += 2){
				a = i;
				b = n - i;
				if(isPrime(b) && a + b == n){
					System.out.println(n+" = "+a+" + "+b);
				}
			}
		}else{
			System.out.println("������һ�����ڵ���6��ż��!");
		}
	}
	public static boolean isEven(int n){//�ж��Ƿ�Ϊż��
		if(n % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	/*public static boolean isPrime(int n){//�ж��Ƿ�Ϊ����
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
 ��������������		break;
				}
			}
		}
		return bool;
	}
	*/
	public static boolean isPrime(int n){//�ж��Ƿ�Ϊ����
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
