/*
	continue,break�ؼ���
*/
class ForDemo8 
{
	public static void main(String[] args) 
	{
		for(int i = 1;i <= 10;i++){
			if(i == 5){
				System.out.println("��"+i+"�����ӵ����˵���");//��������ѭ��,������һ��ѭ��
				continue;//ȥ���������ʽ
			}
			if(i == 8){
				System.out.println("��"+i+"�������ֵ����˵���");
				//���鲻��,���������.
				break;
			}
			System.out.println("���ڳԵ�"+i+"������");
		}
		System.out.println("�緹������!");
	}
}
