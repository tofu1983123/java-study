package corelesson4.simplefactory;

public class FruitTest {

	public static void main(String[] args) {
		/*
		 * ��һ�Ѹ���,���Լ������˸���,��ʵ�������ø���
		 * ��Ӧ��ȥ������(��ȡ)����,�������Լ�����
		 * 
		 * */
		/*Apple apple = new Apple();
		apple.grow();
		apple.harvest();
		System.out.println("======================");
		Grape grape = new Grape();
		grape.grow();
		grape.harvest();*/
		//ʹ��ʹ���ߺʹ����߷���---->����ˮ����Ҫ�޸�FruitFactory�Ĵ���
		/*Fruit fruit  = FruitFactory.getInstance("apple");
		fruit.grow();
		fruit.harvest();*/
		Fruit fruit  = FruitFactory.getInstance();
		fruit.grow();
		fruit.harvest();
		
	}

}
