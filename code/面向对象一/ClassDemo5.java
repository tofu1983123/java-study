class ClassDemo5 
{
	public static void main(String[] args) 
	{
		Point p1 = new Point(10,10);
		Point p2 = new Point(6,8);
		System.out.println(p1.x+","+p1.y);
		p1.showLocation();
		p2.showLocation();
		System.out.println(p1.getDistance());
		System.out.println(p2.getDistance());
	}
}
class Point
{
	double x,y;
	Point(double a,double b){
		x = a;
		y = b;
	}
	double getDistance(){
		return Math.sqrt(x*x+y*y);
	}
	void showLocation(){
		System.out.println("点的坐标为:("+x+":"+y+")");
	}
}