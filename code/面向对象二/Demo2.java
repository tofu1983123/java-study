class Demo2 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle(new Point(10,10),10);
		c.printLocation();
		System.out.println(c.getArea());
		System.out.println("============");
		Rectangle r = new Rectangle(new Point(10,10),10,10);
		r.printLocation();
		System.out.println(r.getArea());
	}
}
class Shape
{
	Point location;
	Shape(Point location){
		this.location = location;
	}
	Shape(double x,double y){
		this(new Point(x,y));
	}
	double getArea(){return 0;}//��ֻ��һ��ģ��,�������ڲ���֪����������
	double getLength(){return 0;}//Ҳ��һ��ģ��,һ�����������
	void printLocation(){
		System.out.println("�ҵ�λ����:"+location.x+","+location.y);
	}
}
class Rectangle extends Shape
{
	double w,h;
	Rectangle(Point location,double w,double h){
		super(location);
		this.w = w;
		this.h = h;
	}
	Rectangle(double x,double y,double w,double h){
		this(new Point(x,y),w,h);
	}
	boolean contains(Point p){
		double a = p.x - this.location.x;
		double b = p.y - this.location.y;
		return a >= 0 && a <= w && b >= 0 && b <= h;
	}
	double getArea(){return w * h;}
	double getLength(){return 2 * (w + h);}
}
class Circle extends Shape
{
	double r;
	Circle(Point location,double r){
		super(location);//�����˸���Ĺ��캯��
		this.r = r;
	}
	Circle(double x,double y,double r){
		this(new Point(x,y),r);
	}
	double getArea(){return 3.14 * r * r;}
	double getLength(){return 2 * 3.14 * r;}
}
class Point
{
	double x,y;
	Point(){}
	Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	double getDistance(){return Math.sqrt(x*x+y*y);}
	double getDistance(Point other){
		return Math.sqrt((x-other.x)*(x-other.x)+(y-other.y)*(y-other.y));
	}
}