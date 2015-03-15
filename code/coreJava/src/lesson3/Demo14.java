package lesson3;

public class Demo14 {

	public static void main(String[] args) {
		PersonZ pz = new PersonZ();
		pz.getOneFly().fly();
		System.out.println("================");
		pz.getOneShape().draw();
	}

}
class PersonZ{
	public CanFly getOneFly(){
		//返回的类型是接口,那么要获取实现了该接口的类的实例
		//符合使用匿名内部类的条件,已知接口获取实现该类接口的类的对象
		return new CanFly(){
			public void fly() {
				System.out.println("bird fly...");
			}
		};
	}
	public Shape getOneShape(){
		/*
		 * 返回值类型是一个抽象类,那么返回的是该抽象类子类的实例
		 * 已知父类 获取其子类的对象 符合使用匿名内部类的条件
		 * 可以直接使用匿名类的对象
		 * */
		return new Shape(){
			@Override
			public double getArea() {return 0;}
			@Override
			public double getLength() {return 0;}
			@Override
			public void draw() {System.out.println("draw shape...");}
		};
	}
}