/*
	酒店前台客房管理
*/
import java.util.Scanner;
class HotelManagerSystem
{
	public static void main(String[] args) 
	{
		/*
		代表楼层所有的房间
		房间编号0101 0102
				0201 0202
				1001
		*/
		//字符串数组如果没有初始化,每个元素都是null
		String[][] rooms = new String[12][10];
		System.out.println("欢迎来到我赢大酒店!");
		System.out.println("请输入要操作的命令:init初始化,search查询,in办理入住,"
		+",out办理退房,quit退出");
		Scanner s = new Scanner(System.in);
		//比较字符串相同 --->"in".equals(command)
		while(true){
			String command = s.next();
			if("init".equals(command)){
				init(rooms);
			}else if("search".equals(command)){
				search(rooms);
			}else if("in".equals(command)){
				in(rooms);
			}else if("out".equals(command)){
				out(rooms);
			}else if("quit".equals(command)){
				System.out.println("系统退出!");
				//break;
				return;
			}else{
				System.out.println("输入有误,请重新输入!");
			}
		}
	}
	/*
		输入房间号,直接退房--->需要判断房间是否存在,是否有人入住
		将来需要大家补充:除房间号还需要输入入住者的名称,要核对
	*/
	public static void out(String[][] rooms){\
		System.out.println("请输入将要退房的房间号:");
		Scanner s = new Scanner(System.in);
		int roomNo = s.nextInt();
		int floor = roomNo / 100;//根据房间号得到楼层
		int no = roomNo % 100;//根据房间号得到楼层的房间号
		if(floor < 1 || floor > 12 || no < 1 || no > 10){//入住函数就可以结束
			System.out.println("输入的房间号有误:请输入out命令继续操作!");
			return;
		}
		if("EMPTY".equals(rooms[floor-1][no-1])){
			System.out.println("该房间没有办理过入住,不需要退房!请输入out命令继续操作!");
			return;
		}
		rooms[floor-1][no-1] = "EMPTY";
		System.out.println("该房间退房成功!");
	}
	//办理入住--->直接输入房间号,进行入住
	//将来可以先列出可入住的房间,再让用于输入房间号
	public static void in(String[][] rooms){
		System.out.println("请输入将要入住的房间号:");
		Scanner s = new Scanner(System.in);
		int roomNo = s.nextInt();
		//需要把房间号转换成楼层和房间--->使其和数组的下标对应
		int floor = roomNo / 100;//根据房间号得到楼层
		int no = roomNo % 100;//根据房间号得到楼层的房间号
		if(floor < 1 || floor > 12 || no < 1 || no > 10){//入住函数就可以结束
			System.out.println("输入的房间号有误:请输入in命令继续操作!");
			//如何结束函数,函数遇到return就结束
			return;
		}
		//继续判断房间是否有人入住
		if(!"EMPTY".equals(rooms[floor-1][no-1])){
			if(floor < 10){
				System.out.println("0"+roomNo+"已经有人入住,请输入in命令继续操作!");
			}else{
				System.out.println(roomNo+"已经有人入住,请输入in命令继续操作!");
			}
			return;
		}
		System.out.println("请输入您的姓名:");
		String name = s.next();
		rooms[floor-1][no-1] = name;
		System.out.println("恭喜您,入住成功!");
	}
	/*房间查询 --->将来自己在做的时候,可以输入具体房间号,
		或者房间的状态来进行查询
	*/
	public static void search(String[][] rooms){
		for(int i = 0;i < rooms.length;i++){
			//打印房间号
			for(int j = 0;j < rooms[i].length;j++){
				if(i < 9){
					System.out.print("0");
				}
				int roomNo = (i+1)*100 + j+1;
				System.out.print(roomNo+"\t");
			}
			System.out.println();
			//打印房间的状态
			for(int k = 0;k < rooms[i].length;k++){
				System.out.print(rooms[i][k]+"\t");
			}
			System.out.println();
		}
	}
	//初始化所有的房间
	public static void init(String[][] rooms){
		for(int i = 0;i < rooms.length;i++){
			for(int j = 0;j < rooms[i].length;j++){
				rooms[i][j] = "EMPTY";
			}
		}
		System.out.println("房间初始化完毕!");
	}
}
