package lesson3;

public class Computer {

	public static void main(String[] args) {
		//MainBord mainBord = new MainBord(new AMemory(),new ADisplayCard());
		MainBord mainBord = new MainBord(new BMemory(),new BDisplayCard());
		mainBord.cacheData();
		mainBord.disp();
	}

}
class AMemory implements Memory{
	public void cache() {
		System.out.println("amemory cache data");
	}
}
class BMemory implements Memory{
	public void cache() {
		System.out.println("bmemory cache data");
	}
}
class ADisplayCard implements DisplayCard{
	public void display(){
		System.out.print("ADisplay Card display");
	}
}
class BDisplayCard implements DisplayCard{
	public void display(){
		System.out.print("BDisplay Card display");
	}
}
