/*
	�������A��ȫ������(����1��������A����)֮�͵���B��
	������B��ȫ������(����1��������B����)֮�͵���A��
	�������A\B��һ������������3000���ڵ�ȫ����������
*/
class Homework2 
{
	public static void main(String[] args) 
	{
		int A = 0,B = 0;
		for(int i = 1;i < 3000;i++){
			for(int j = 1;j < i;j++){
				A = i;
				B = j;
				if(sumDivisor(A) == B && sumDivisor(B) == A){
					System.out.println(A+"��"+B+"��һ��������");
				}
			}
		}
		/*
			��ӡ�Ľ����248��220��1210��1184��2924��2620
		*/
		
	}
	public static int sumDivisor(int n){
		int sum = 0;
		for(int i = 1;i <= n/2;i++){
			if(n % i == 0){//û������,������
				sum += i;
			}
		}
		return sum;
	}
}
