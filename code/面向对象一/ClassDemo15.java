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
	//写构造函数
	Circle(Point center,double r){
		this.center = center;
		this.r = r;
	}
	//创建如下的构造函数
	Circle(double x,double y,double r){
		//this.center = new Point(x,y);
		//this.r = r;
		//直接调用上面的构造函数,可不可以呢?
		this(new Point(x,y),r);//调用重载中的另外一个构造函数,且放在第一句
	}
	//行为 求面积,求周长,是否包含一个点
	double getArea(){return 3.14 * r * r;}
	double getLength(){return 2 * 3.14 * r;}
	//圆是否包含点p,p到圆心的距离 <= r就在圆内,否则在圆外
	boolean contain(Point p){
		//求p到center的距离
		return center.getDistance(p) <= r;
	}
	boolean contain(double x,double y){
		//return center.getDistance(new Point(x,y));
		return contain(new Point(x,y));//this也可以省略
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
	//点到圆心的距离
	double getDistance(){return Math.sqrt(x*x+y*y);}
	//一个点到另外一个点的距离
	//思考:这个函数将来要被一个点对象调用,求的就是那个点和other点间的距离
	double getDistance(Point other){
		return Math.sqrt((x-other.x)*(x-other.x)+(y-other.y)*(y-other.y));
	}
}