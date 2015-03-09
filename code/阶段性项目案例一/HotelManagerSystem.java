/*
	�Ƶ�ǰ̨�ͷ�����
*/
import java.util.Scanner;
class HotelManagerSystem
{
	public static void main(String[] args) 
	{
		/*
		����¥�����еķ���
		������0101 0102
				0201 0202
				1001
		*/
		//�ַ����������û�г�ʼ��,ÿ��Ԫ�ض���null
		String[][] rooms = new String[12][10];
		System.out.println("��ӭ������Ӯ��Ƶ�!");
		System.out.println("������Ҫ����������:init��ʼ��,search��ѯ,in������ס,"
		+",out�����˷�,quit�˳�");
		Scanner s = new Scanner(System.in);
		//�Ƚ��ַ�����ͬ --->"in".equals(command)
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
				System.out.println("ϵͳ�˳�!");
				//break;
				return;
			}else{
				System.out.println("��������,����������!");
			}
		}
	}
	/*
		���뷿���,ֱ���˷�--->��Ҫ�жϷ����Ƿ����,�Ƿ�������ס
		������Ҫ��Ҳ���:������Ż���Ҫ������ס�ߵ�����,Ҫ�˶�
	*/
	public static void out(String[][] rooms){\
		System.out.println("�����뽫Ҫ�˷��ķ����:");
		Scanner s = new Scanner(System.in);
		int roomNo = s.nextInt();
		int floor = roomNo / 100;//���ݷ���ŵõ�¥��
		int no = roomNo % 100;//���ݷ���ŵõ�¥��ķ����
		if(floor < 1 || floor > 12 || no < 1 || no > 10){//��ס�����Ϳ��Խ���
			System.out.println("����ķ��������:������out�����������!");
			return;
		}
		if("EMPTY".equals(rooms[floor-1][no-1])){
			System.out.println("�÷���û�а������ס,����Ҫ�˷�!������out�����������!");
			return;
		}
		rooms[floor-1][no-1] = "EMPTY";
		System.out.println("�÷����˷��ɹ�!");
	}
	//������ס--->ֱ�����뷿���,������ס
	//�����������г�����ס�ķ���,�����������뷿���
	public static void in(String[][] rooms){
		System.out.println("�����뽫Ҫ��ס�ķ����:");
		Scanner s = new Scanner(System.in);
		int roomNo = s.nextInt();
		//��Ҫ�ѷ����ת����¥��ͷ���--->ʹ���������±��Ӧ
		int floor = roomNo / 100;//���ݷ���ŵõ�¥��
		int no = roomNo % 100;//���ݷ���ŵõ�¥��ķ����
		if(floor < 1 || floor > 12 || no < 1 || no > 10){//��ס�����Ϳ��Խ���
			System.out.println("����ķ��������:������in�����������!");
			//��ν�������,��������return�ͽ���
			return;
		}
		//�����жϷ����Ƿ�������ס
		if(!"EMPTY".equals(rooms[floor-1][no-1])){
			if(floor < 10){
				System.out.println("0"+roomNo+"�Ѿ�������ס,������in�����������!");
			}else{
				System.out.println(roomNo+"�Ѿ�������ס,������in�����������!");
			}
			return;
		}
		System.out.println("��������������:");
		String name = s.next();
		rooms[floor-1][no-1] = name;
		System.out.println("��ϲ��,��ס�ɹ�!");
	}
	/*�����ѯ --->�����Լ�������ʱ��,����������巿���,
		���߷����״̬�����в�ѯ
	*/
	public static void search(String[][] rooms){
		for(int i = 0;i < rooms.length;i++){
			//��ӡ�����
			for(int j = 0;j < rooms[i].length;j++){
				if(i < 9){
					System.out.print("0");
				}
				int roomNo = (i+1)*100 + j+1;
				System.out.print(roomNo+"\t");
			}
			System.out.println();
			//��ӡ�����״̬
			for(int k = 0;k < rooms[i].length;k++){
				System.out.print(rooms[i][k]+"\t");
			}
			System.out.println();
		}
	}
	//��ʼ�����еķ���
	public static void init(String[][] rooms){
		for(int i = 0;i < rooms.length;i++){
			for(int j = 0;j < rooms[i].length;j++){
				rooms[i][j] = "EMPTY";
			}
		}
		System.out.println("�����ʼ�����!");
	}
}
