import java.util.Scanner;
class SwitchDemo2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("��������:");
		int y = s.nextInt();
		System.out.println("��������:");
		int m = s.nextInt();
		System.out.println("��������:");
		int d = s.nextInt();
		/*
			������������,�ж������������һ�굱���Ѿ����˶�����.
			����������1999��,4,20
			ֻҪ1��2��3�µ������ܺ��ټ���20�켴��
			switch(m - 1){				
			}
			�ۼ���ͻᶨ������������յĺ�,��0��ʼ
		*/
		int sum = 0;
		switch (m-1)
		{
		case 11:
			sum += 30;
		case 10:
			sum += 31;
		case 9:
			sum += 30;
		case 8:
			sum += 31;
		case 7:
			sum += 31;
		case 6:
			sum += 30;
		case 5:
			sum += 31;
		case 4:
			sum += 30;
		case 3:
			sum += 31;
		case 2:
			if(y%4==0&&y%100!=0||y%400==0)
				sum += 29;
			else
				sum += 28;
		case 1:
			sum += 31;
		}
		sum += d;
		System.out.println(y+"��"+m+"��"+d+"������һ���Ѿ���ȥ������:"+sum);
	}
}
