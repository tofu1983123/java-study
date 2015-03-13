package lesson3;

public class Demo8 {

	public static void main(String[] args) {
		TestMyInterface t = new TestMyInterface();
		t.song();
		t.swim();
		t.fight();
		t.myMethod();
	}

}
interface MyInterface extends CanSwim,CanSong,CanFight{
	void myMethod();
}
class TestMyInterface implements MyInterface{

	public void swim() {
		System.out.println("swimming...");
	}

	public void song() {
		System.out.println("songing...");
	}

	public void fight() {
		System.out.println("fighting...");
	}

	public void myMethod() {
		System.out.println("meMethoding...");
	}
	
}
