class ForDemo18 
{
	public static void main(String[] args) 
	{
		outer:for(int i=1;i <= 10;i++){
			for(int j=1;j <= 10;j++){
				if(j == 3)break outer;//直接跳出outer标识的for结构
				System.out.println(i+","+j+"  ");
			}
			System.out.println();
		}
	}
}
