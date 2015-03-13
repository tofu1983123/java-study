package lesson3;

public class Demo7 {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.song();
		hero.fight();
		hero.swim();
		System.out.println("1=============");
		CanSwim cs = new Hero();//这个时候只认为它是会游泳的
		cs.swim();//不能调用其他方法
		
		CanSong csong = new Hero();
		csong.song();
		System.out.println("2=============");
		hero.walk();
		System.out.println("3=============");
		Personx personx = new Hero();
		personx.walk();
	}

}
abstract class Personx{
	public abstract void walk();
}
class Hero extends Personx implements CanSwim,CanFight,CanSong{
	
	public void walk(){
		System.out.println("walking...");
	}
	
	public void song() {
		System.out.println("songing...");
	}

	public void fight() {
		System.out.println("fighting...");
	}

	public void swim() {
		System.out.println("swimming...");
	}
	
}
interface CanSwim{
	void swim();
}
interface CanFight{
	void fight();
}
interface CanSong{
	void song();
}