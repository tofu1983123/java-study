/*
	假设有一个int类型的数组,数组包含10000个可重复的元素,现不使用排序的方式,
	用最快的速度找到第1000个大的数字
*/
import java.util.Random;
class Homework1 
{
	public static void main(String[] args) 
	{
		int[] a = new int[10000];
		for(int i = 0;i < a.length;i++){
			Random r = new Random();
			a[i] = r.nextInt();
		}
	}
}
