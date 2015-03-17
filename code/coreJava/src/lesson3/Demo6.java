package lesson3;

public class Demo6 {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
		Plane plane = new Plane();
		plane.fly();
		/*
		 * ��Ҫһ����ɵĶ���
		 * ʵ����CanFly�ӿڵĲ���Ϊ�ǻ�ɵ�
		 * ��ֵʱ��һ��ʵ����CanFly�ӿڵ����ʵ�����󼴿�.
		 * ���﷨�Ƕ�,һ��������Ϊ�Ǹ�������������������ʵ��
		 * (ʵ�ʲ�Ҫ��Ϊ���Ӹ����ϵ,�Ǿ߱���ĳ�ֹ���)
		 * */
		System.out.println("1================");
		CanFly fly1 = new Bird();
		fly1.fly();//����ʵ���˽ӿڵ���ķ���
		CanFly fly2 = new Plane();
		fly2.fly();
		System.out.println("2================");
		Person1 person1 = new Person1();
		person1.toFly(bird);
		System.out.println("3================");
		person1.getOneCanFly().fly();
	}

}
interface CanFly{
	void fly();//�൱�� public abstract void fly();
	
}
class Bird implements CanFly{
	public void fly(){
		System.out.println("bird fly...");
	}
}
class Plane implements CanFly{
	public void fly(){
		System.out.println("plane fly...");
	}
}
class Person1{
	/*
	 * �÷����Ĳ�������һ���ӿ�,���ø÷���ʱҪ���ݵ���
	 * ʵ���˸ýӿڵ���Ķ���
	 * */
	public void toFly(CanFly f1){
		f1.fly();
	}
	public CanFly getOneCanFly(){
		//�÷����ķ���ֵ�����ǽӿ�,
		//���ص���ʵ���˸ýӿڵ����ʵ������
		//return new Bird();
		return new Plane();
	}
}