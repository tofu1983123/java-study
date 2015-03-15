package lesson3;

public class Demo15 {

	public static void main(String[] args) {
		Personw person = new Personw();
		/*调用方法的时候,发现参数是一个接口
		 * 那么传递的就是实现了该接口的类的对象
		 * 已经知道接口,获取其实现类的对象,符合条件
		 * 可以直接用匿名类的对象*/
		person.playFly(new CanFly(){
			public void fly() {
				System.out.println("plane...flying...");
			}
			
		});
		System.out.println("=================");
		/*
		 * 参数是一个抽象类,那么要传递的是其子类的对象
		 * 符合使用匿名类的条件,可以用
		 * */
		person.playDraw(new Shape(){
			@Override
			public double getArea() {
				return 0;
			}
			@Override
			public double getLength() {
				return 0;
			}
			@Override
			public void draw() {
				System.out.println("draw...shape...");
			}
		});
	}
}
class Personw{
	public void playFly(CanFly fly){
		fly.fly();
	}
	public void playDraw(Shape shape){
		shape.draw();
	}
}