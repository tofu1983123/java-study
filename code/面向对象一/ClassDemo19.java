class ClassDemo19 
{
	static{
		System.out.println("helloworld");
		System.exit(0);//�˳�����.
	}//��̬��,ֻ����һ��
	//������������Ǿ�̬�ĳ�Ա����
	public static void main(String[] args) 
	{
		//��̬�鲻һ�����ڴ��������ʱ�����,���ڵ�һ���õ���ͼ���,����ֻ����һ��
		Person.printData();
	}
}
class Person
{
	//static int diqiu = 1;
	double h;
	static int diqiu;
	static{
		diqiu = 1;
		System.out.println("static...");
	}
	static void printData(){
		System.out.println(diqiu);
		//System.out.println(h);�����,��̬��Ա����ֻ�ܷ��ʾ�̬��Ա
	}
}