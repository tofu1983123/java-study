import java.util.Scanner;
class ArrayDemo4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[] a = new int[6];
		int sum = 0;//��� ��
		for(int i = 0;i < a.length;i++){
			System.out.println("����������ĵ�"+(i+1)+"��Ԫ��");
			a[i] = s.nextInt();
			sum += a[i];
		}
		//�����ֵ����Сֵ
		int max = a[0],min = a[0];//����a[0]��������,��С��
		for(int i = 1;i < a.length;i++){
			if(max < a[i])
				max = a[i];
			if(min > a[i])
				min = a[i];
		}
		int avg = sum / a.length;
		System.out.println("���ֵ:"+max+",��Сֵ:"+min+",��:"+sum+",ƽ��ֵ:"+avg);
	}
}
