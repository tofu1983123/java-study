class StringDemo1 
{
	public static void main(String[] args) 
	{
		char a = 'a';
		//表示姓名,需要有多个字符组成,那就是字符串
		String name = "张三";
		String name2 = "lisi";

		String[] names = {"张三","李四","王五","tom","jim"}
		for(int i = 0;i < names.length;i++){
			System.out.println(names[i]);
		}

		String[][] teamNames = {
			{"zhangsan","lisi","wangwu"},
			{"zhaoliu","tianqi"}
		};
		for(int i = 0;i < teamNames.length;i++){
			for(int j = 0;j < teamNames.length;j++){
				System.out.println(teamNames[i][j]+" ");
			}
			System.out.println();
		}
	}
}
