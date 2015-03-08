/*
	求一个数的因子(包含1,也包含自己),放入数组并返回
*/
class ArrayDemo7 
{
	public static void main(String[] args) 
	{
		int[] a = getSons(10);
		printArray(a);
	}
	//计算一个数字因子的个数
	public static int getLength(int n){
		int count = 0;
		for(int i = 1;i <= n/2;i++){
			if(n % i == 0)
				count++;
		}
		count++;//因为包含了数字本身,所以要count++
		return count;
	}
	public static int[] getSons(int n){
		int[] a = new int[getLength(n)];
		int j = 0;
		for(int i = 1;i < n/2;i++){
			if(n % i == 0){
				a[j++] = i;
			}
		}
		a[j] = n;//自己也放入
		return a;
	}
	public static void printArray(int[] a){
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
