package lesson3;

public class Demo15 {

	public static void main(String[] args) {
		Personw person = new Personw();
		/*���÷�����ʱ��,���ֲ�����һ���ӿ�
		 * ��ô���ݵľ���ʵ���˸ýӿڵ���Ķ���
		 * �Ѿ�֪���ӿ�,��ȡ��ʵ����Ķ���,��������
		 * ����ֱ����������Ķ���*/
		person.playFly(new CanFly(){
			public void fly() {
				System.out.println("plane...flying...");
			}
			
		});
		System.out.println("=================");
		/*
		 * ������һ��������,��ôҪ���ݵ���������Ķ���
		 * ����ʹ�������������,������
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