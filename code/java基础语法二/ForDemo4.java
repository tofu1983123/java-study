/*
	��ӡ1��100֮����ܱ�3�������ܱ�5����������
	����¼�м���
*/
class ForDemo4
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int i = 1;i <= 100;i++){
			if(i % 3 == 0 && i % 5 == 0){
				count++;
				System.out.println(i);
			}
		}
		System.out.println("����"+count+"��");
	}
}
