class StringDemo1 
{
	public static void main(String[] args) 
	{
		char a = 'a';
		//��ʾ����,��Ҫ�ж���ַ����,�Ǿ����ַ���
		String name = "����";
		String name2 = "lisi";

		String[] names = {"����","����","����","tom","jim"}
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
