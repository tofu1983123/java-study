/*
	��ҵ1:���˼Ʒ�����
	����������С��20�����ʱ��,�շ�5Ԫ,����20����
	С��100�����ʱ�򳬳�20����Ĳ��ְ�ÿ0.2Ԫ
	ÿ����Ʒ�,�������100�����ʱ��,�����Ĳ���
	����ÿ����0.15Ԫ����.������������,�������
	֮�������˷�.
*/
import java.util.Scanner;
class Homework1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("�������������(����):");
		double weight = s.nextDouble();
		double freight = 0;
		if(weight <= 20 && weight > 0){
			freight = 5;
		}else if(weight > 20 && weight <= 100){
			freight = 5 + (weight - 20)*0.2;
		}else if(weight > 100){
			freight = 5 + 80 * 0.2 + (weight - 100)*0.15;
		}else{
			System.out.println("����Ļ�����������!");
		}
		if(freight > 0)
			System.out.println("������˷���:"+freight+"Ԫ");
	}
}
