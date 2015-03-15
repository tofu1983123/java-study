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
		//���ص������ǽӿ�,��ôҪ��ȡʵ���˸ýӿڵ����ʵ��
		//����ʹ�������ڲ��������,��֪�ӿڻ�ȡʵ�ָ���ӿڵ���Ķ���
		return new CanFly(){
			public void fly() {
				System.out.println("bird fly...");
			}
		};
	}
	public Shape getOneShape(){
		/*
		 * ����ֵ������һ��������,��ô���ص��Ǹó����������ʵ��
		 * ��֪���� ��ȡ������Ķ��� ����ʹ�������ڲ��������
		 * ����ֱ��ʹ��������Ķ���
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