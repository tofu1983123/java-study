class ForDemo14
{
	public static void main(String[] args) 
	{
		for(int i=1;i <= 7;i++){
			for (int j=1;j<= 7-i;j++ )
			{
				System.out.print(" ");//�ո��ڵݼ�,i�ڵ���
			}
			for (int k=1;k <= 2*i - 1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i = 6;i >= 1;i--){
			for(int j=1;j<= 7-i;j++){//�ո��ڵ���,i�ڵݼ�
				System.out.print(" ");
			}
			for (int k=1;k <= 2*i - 1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
