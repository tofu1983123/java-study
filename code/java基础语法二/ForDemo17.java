class ForDemo17 
{
	public static void main(String[] args) 
	{
		for(int i=1;i <= 10;i++){
			for(int j=1;j <= 10;j++){
				if(j == 3)break;//ֱ����ѭ��������break,���������������for�ṹ
				System.out.println(i+","+j+"  ");
			}
			System.out.println();
		}
	}
}
