/*
	��ˮ�ɻ�������νˮ�ɻ�������ָһ����λ��abc��
	�������a3+b3+c3=abc(a��3�η�)��abc��ˮ�ɻ�����
	��ӡ����ˮ�ɻ���
*/
class Homework2
{
	public static void main(String[] args) 
	{
		int a = 0;
		int b = 0;
		int c = 0;
		for(int m = 101;m < 1000;m++){
			a = m / 100;
			b = m / 10 % 10;
			c = m % 10;
			if((a*a*a + b*b*b + c*c*c) == m){
				System.out.println(m + "��һ��ˮ�ɻ���");
			}
		}
	}
}
