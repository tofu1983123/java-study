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
	void drawShape(Shape s){//Shape����Ϊ����,�������Դ�������ʵ�������������ʵ��
		s.draw();
	}
	Shape getOneShape(){
		//return new Circle();//Shape��Ϊ����ֵ����,���Է�������ʵ�������������ʵ��
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