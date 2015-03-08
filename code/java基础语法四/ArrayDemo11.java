/*
	扩容,拷贝
*/
class ArrayDemo11 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8};
		int[] b = new int[a.length];
		/*
			第一个参数 源数组
			第二个参数 源数组的哪个位置开始
			第三个参数 目标数组
			第四个参数 放到目标数组的哪个位置
			第四个参数 拷贝几个
		*/
		System.arraycopy(a,b);//(源数组,0,目标数组,0,数组长度)
		ArrayDemo7.printArray(b);
		int[] c = new int[a.length+1];
		System.arraycopy(a,0,c,0,3);
		ArrayDemo7.printArray(c);
	}
}
