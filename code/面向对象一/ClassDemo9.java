class ClassDemo9 
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();//�����޲����Ĺ��캯��
		p1.showLocation();
		Point p2 = new Point(6,8);//���������������Ĺ��캯��
		p2.showLocation();
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