class ArrayDemo1 
{
	public static void main(String[] args) 
	{
		//��������ʼ��
		int[] scores = {98,76,88,90,67,64,87};
		//��η��ʵ�һ��Ԫ�� scores[0],scores[1],scores[2]
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		//����ĳ��� ===>�����и�length����
		System.out.println(scores.length);
		//�����������е�Ԫ��
		for(int i = 0;i < scores.length;i++){
			System.out.print(scores[i]+" ");
		}
	}
}
