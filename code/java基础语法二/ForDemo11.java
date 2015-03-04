class ForDemo11 
{
	public static void main(String[] args) 
	{
		for(int i=1;i <= 10;i++){
			for(int j=1;j<=10;j++){//i等于1进来 j就要从1到10,i=2进来,j又要从1到10... ...
				System.out.println(i+","+j+"  ");
			}
			System.out.println();
		}
	}
}
