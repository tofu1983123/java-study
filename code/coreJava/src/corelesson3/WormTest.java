package corelesson3;

import java.util.Scanner;

public class WormTest {

	public static void main(String[] args) {
		/*Node node1 = new Node(1,1);
		Node node2 = new Node(1,1);
		System.out.println(node1.equals(node2));*/
		WormPanel panel = new WormPanel();
		Worm worm = panel.getWorm();
		/*for(int i = 0;i < 10;i++){
			panel.print();
			worm.step();
			try {
				Thread.sleep(1000);//睡1秒
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}*/
		Scanner s = new Scanner(System.in);
		while(true){
			String dir = s.nextLine();
			if(dir.equalsIgnoreCase("u")){
				worm.step(Worm.UP);
			}else if(dir.equalsIgnoreCase("d")){
				worm.step(Worm.DOWN);
			}else if(dir.equalsIgnoreCase("l")){
				worm.step(Worm.LEFT);
			}else if(dir.equalsIgnoreCase("r")){
				worm.step(Worm.RIGHT);
			}else if(dir.equalsIgnoreCase("bye")){
				System.out.println("^-^");
				System.exit(0);
			}else{
				worm.step();
			}
			panel.print();
		}
	}

}
