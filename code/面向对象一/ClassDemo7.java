class ClassDemo7
{
	public static void main(String[] args) 
	{
		//�ȴ����ӷ�����Ķ���
		Adder adder = new Adder();
		System.out.println(adder.add(10,10));
		System.out.println(adder.add(10.5,10.3));
		System.out.println(adder.add(1,2,3));
		System.out.println("=====================");
		System.out.println(adder.add('a','b'));//�����97+98=195
	}
}
class Adder
{
	//�Ѹ÷���ע��,����Ч��
	int add(char a,char b){
		System.out.println("char...");
		return a + b;
	}
	int add(int a,int b){
		System.out.println("add1...");
		return a + b;
	}
	int add(int a,int b,int c){
		System.out.println("��������...");
		return a + b + c;
	}
	double add(double a,double b){
		System.out.println("double...");
		return a + b;
	}
}
