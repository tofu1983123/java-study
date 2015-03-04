class ForDemo17 
{
	public static void main(String[] args) 
	{
		for(int i=1;i <= 10;i++){
			for(int j=1;j <= 10;j++){
				if(j == 3)break;//直接在循环中遇到break,跳出的是它最近的for结构
				System.out.println(i+","+j+"  ");
			}
			System.out.println();
		}
	}
}
