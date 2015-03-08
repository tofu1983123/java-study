class ArrayDemo1 
{
	public static void main(String[] args) 
	{
		//声明并初始化
		int[] scores = {98,76,88,90,67,64,87};
		//如何访问第一个元素 scores[0],scores[1],scores[2]
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		//数组的长度 ===>数组有个length属性
		System.out.println(scores.length);
		//遍历数组所有的元素
		for(int i = 0;i < scores.length;i++){
			System.out.print(scores[i]+" ");
		}
	}
}
