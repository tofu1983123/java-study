class ClassDemo15 
{
	public static void main(String[] args) 
	{
		Point p1 = new Point(10,10);
		Point other = new Point(5,5);
		//System.out.println(p1.getDistance(other));
		Circle c1 = new Circle(p1,10);
		System.out.println(c1.contain(other));
		System.out.println(c1.contain(6,6));
		Circle c2 = new Circle(10,10,10);
		System.out.println(c2.contain(20,20));
	}
}
class Circle
{
	Point center;
	double r;
	//д���캯��
	Circle(Point center,double r){
		this.center = center;
		this.r = r;
	}
	//�������µĹ��캯��
	Circle(double x,double y,double r){
		//this.center = new Point(x,y);
		//this.r = r;
		//ֱ�ӵ�������Ĺ��캯��,�ɲ�������?
		this(new Point(x,y),r);//���������е�����һ�����캯��,�ҷ��ڵ�һ��
	}
	//��Ϊ �����,���ܳ�,�Ƿ����һ����
	double getArea(){return 3.14 * r * r;}
	double getLength(){return 2 * 3.14 * r;}
	//Բ�Ƿ������p,p��Բ�ĵľ��� <= r����Բ��,������Բ��
	boolean contain(Point p){
		//��p��center�ľ���
		return center.getDistance(p) <= r;
	}
	boolean contain(double x,double y){
		//return center.getDistance(new Point(x,y));
		return contain(new Point(x,y));//thisҲ����ʡ��
	}
}
class Point
{
	double x,y;
	Point(){
	
	}
	Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	//�㵽Բ�ĵľ���
	double getDistance(){return Math.sqrt(x*x+y*y);}
	//һ���㵽����һ����ľ���
	//˼��:�����������Ҫ��һ����������,��ľ����Ǹ����other���ľ���
	double getDistance(Point other){
		return Math.sqrt((x-other.x)*(x-other.x)+(y-other.y)*(y-other.y));
	}
}