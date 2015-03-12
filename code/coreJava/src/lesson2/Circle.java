package lesson2;

public class Circle extends Shape{
	/*java中的继承是全部继承,即使private也继承
	 * private继承过来之后,不能直接访问,只能通过
	 * 继承过来的父类的非private函数访问
	 * 
	 * */
	private double r;
	public Circle(Point Location,double r) {
		super(Location);
		this.r = r;
		// TODO 自动生成的构造函数存根
	}
	public double getArea(){
		return 3.14 * r * r;
	}
	public double getLength(){
		return 2 * 3.14 * r;
	}
	public boolean contains(Point p){
		return this.getLocation().getDistance() <= r;
	}
	public void printData() {
		// TODO 自动生成的方法存根
		super.printData();
		System.out.println("半径是:"+r);
	}
}
