class ClassDemo11
{
	public static void main(String[] args) 
	{
		//���ֶ��������
		Point p1 = new Point(8,8);//p1������һ�����ʵ��
		//Point p2 = p1;//p2ָ��(����)��p1ָ��(����)��ʵ������
		//p2.x = 20;//p1��p2ָ����ͬһ������
		//System.out.println(p1.x);//��ӡ����� 20
		Point p2 = new Point(10,10);
		p2 = p1;//p2ָ��(����)��p1ָ��(����)��ʵ������
		p2.x = 20;
		System.out.println(p1.x);
	}
}
class Point
{
	double x,y;
	Point(double a,double b){
		x = a;
		y = b;
	}
	Point(){
		
	}
	double getDistance(){
		return Math.sqrt(x*x+y*y);
	}
	void showLocation(){
		System.out.println("�������Ϊ:("+x+":"+y+")");
	}
}