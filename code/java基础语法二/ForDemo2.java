/*
	��1��100�ĺ�
	�ۼ���� ����һ������������յĺ�
	int sum = 0;
	��һ���ۼ�1,�ڶ����ۼ�2,...��100���ۼ�100
	�ܹ��ۼ�100��
*/
class ForDemo2 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i = 1;i <= 100;i++){
			sum += i;
		}
		System.out.println("sum="+sum);

		int sum1 = 0;
		for(int i = 100;i >= 1;i--){
			sum1 += i;
		}
		System.out.println("sum1="+sum1);
	}
}
