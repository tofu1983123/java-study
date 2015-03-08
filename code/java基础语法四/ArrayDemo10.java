/*
	有一个数组已经初始化完毕,现在向其下标3插入一个元素
*/
class ArrayDemo10 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		//第一,输入插入一个元素,多了一个元素数组是放不下的.
		//a[10] = 100;数组下标只能到9,所以10数据下标就越界了.
		//先扩容
		int[] b = new int[11];
		//把a的内容复制到b中
		for(int i = 0;i < a.length;i++){
			b[i] = a[i];
		}
		//ArrayDemo7.printArray(b);
		//如果还想使用a,可以这样做
		a = b;//使得a指向了b指向的数组
		for(int i = a.length-1;i > 3;i--){
			a[i] = a[i-1];
		}
		a[3] = 100;
		ArrayDemo7.printArray(a);
	}
}
