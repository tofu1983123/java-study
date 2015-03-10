class ClassDemo11
{
	public static void main(String[] args) 
	{
		//区分对象和引用
		Point p1 = new Point(8,8);//p1引用了一个点的实例
		//Point p2 = p1;//p2指向(引用)了p1指向(引用)的实例对象
		//p2.x = 20;//p1和p2指向了同一个对象
		//System.out.println(p1.x);//打印结果是 20
		Point p2 = new Point(10,10);
		p2 = p1;//p2指向(引用)了p1指向(引用)的实例对象
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
		System.out.println("点的坐标为:("+x+":"+y+")");
	}
}