/*
	*******
	 ******
	  *****
	   ****
        ***
         **
          *

*/
class ForDemo13 
{
	public static void main(String[] args) 
	{
		for(int i=7;i >= 1;i--){
			for(int j=1;j <= 7-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k <= i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
