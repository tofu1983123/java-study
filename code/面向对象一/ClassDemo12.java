class ClassDemo12 
{
	public static void main(String[] args) 
	{
		//this在哪?什么是this?
		Point p1 = new Point(10,10);
		p1.showLocation();

		Point p2 = new Point(20,20);
		p2.showLocation();
	}
}
class Point
{
	double x,y;
	Point(double a,double b){
		this.x = a;
		this.y = b;
	}
	Point(){
		
	}
	double getDistance(){
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	void showLocation(){
		System.out.println("点的坐标为:("+this.x+":"+this.y+")");
	}
}