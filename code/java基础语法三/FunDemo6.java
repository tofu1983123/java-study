/*
	��ӡ10��1000֮�������λ֮��Ϊ5������
	Ҫ��:��һ�����ֵĸ�����λ֮����д�ɺ���
*/
class FunDemo6
{
	public static void main(String[] args) 
	{
		for(int i = 10;i <= 1000;i++){
			if(getSum(i) == 5){
				System.out.println(i);
			}
		}
	}
	public static int getSum(int n){//�������˾��巵��ֵ����,����ͨ��return����,������벻ͨ��
		int sum = 0;
		while(n != 0){
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}
}
