/*
	����һ������,�жϸ������Ƿ�Ϊ����(������������)
    ֻ�ܱ�1���Լ���������
	˼·:
		����������n,�õ�������־ʹ�2��ʼ�� һֱ����n-1
		�����������,��ô��˵��������,����������.
		ѭ������for(int i=2;i<n;i++)
		����һ�����ֳ��Դ����Լ�һ��(�������Լ�)�����϶�������.
		for(int i=2;i <= n/2;i++)
*/
import java.util.Scanner;
class ForDemo9
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("������һ������:");
		int n = s.nextInt();
		int i;
		for(i = 2;i <= n/2;i++){
			if(n % i == 0)
				break;
			//else
			//	continue;
		}
		/*
			������ж��Ƿ�Ϊ������
			����:����ѭ���м������Խ���ѭ���ĵط�
				�����ط�:a.i<= n/2����������ʱ �ٽ���� i=n/2
						 b.������break
				�����a����������ѭ�� ��ô˵��������
				�����b����������ѭ�� ��ô˵����������
				���b���� i�Ǵﲻ���ٽ�� i = n/2 + 1
		*/
		if(i > n/2){
			System.out.println(n + "������");
		}else{
			System.out.println(n + "��������");
		}
	}
}
