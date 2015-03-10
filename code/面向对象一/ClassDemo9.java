class ClassDemo9 
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();//调用无参数的构造函数
		p1.showLocation();
		Point p2 = new Point(6,8);//调用了两个参数的构造函数
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
		System.out.println("点的坐标为:("+x+":"+y+")");
	}
}