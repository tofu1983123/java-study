import java.util.Arrays;
import java.util.Random;
class ArrayDemo17 
{
	public static void main(String[] args) 
	{
		int[] a = new int[1000000];
		for(int i = 0;i < a.length;i++){
			//随机赋值
			Random r = new Random();
			a[i] = r.nextInt();//获取一个随机的整数
		}
		//获得当前的时间到1970年1月1日0时开始相差的毫秒数
		long start = System.currentTimeMillis();
		Arrays.sort(a);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
