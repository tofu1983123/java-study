class ForDemo14
{
	public static void main(String[] args) 
	{
		for(int i=1;i <= 7;i++){
			for (int j=1;j<= 7-i;j++ )
			{
				System.out.print(" ");//空格在递减,i在递增
			}
			for (int k=1;k <= 2*i - 1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i = 6;i >= 1;i--){
			for(int j=1;j<= 7-i;j++){//空格在递增,i在递减
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
