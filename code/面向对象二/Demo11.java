class Demo11 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		c1.draw();
		Rectangle r = new Rectangle();
		r.draw();

		Shape s1 = new Circle();
		Shape s1 = new Rectangle();
		s1.draw();
		s2.draw();
		System.out.println("================");
		Person p = new Person();
		//p.drawShape(c1);
		p.drawShape(r);
		System.out.println("================");
		p.getOneShape().draw();
	}
}
class Person
{
	void drawShape(Shape s){//Shape类作为参数,将来可以传递它的实例还有其子类的实例
		s.draw();
	}
	Shape getOneShape(){
		//return new Circle();//Shape作为返回值类型,可以返回它的实例或者其子类的实例
		return new Rectangle;
	}
}
class Shape
{
	void draw(){System.out.println("...");}
}
class Circle extends Shape
{
	void draw(){System.out.println("draw circle...");}
}
class Rectangle extends Shape
{
	void draw(){System.out.println("draw rectangle...");}
}