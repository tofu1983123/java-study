import java.util.Arrays;
class ArrayDemo13 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6};
		a = insertArray(a,1,100);
		System.out.println(Arrays.toString(a));
	}
	public static int[] insertArray(int[] a,int pos,int value){
		if(pos < 0 || pos > a.length)
			return a;//下标不对,直接返回原数组,以后用异常处理
		//放入一个元素,先要扩容,然后复制
		a = Arrays.copyOf(a,a.length+1);
		for(int i = a.length-1;i > pos;i--){
			a[i] = a[i-1];//后移动
		}
		a[pos] = value;
		return a;
	}
}
