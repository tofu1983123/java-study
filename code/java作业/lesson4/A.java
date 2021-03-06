class A
{
	public static void main(String[] args) 
	{
		int[][] a = {
			{1,2,3,4,5},
			{6,7,8},
			{9,10}
		};
		int[][][] b = {
			{
				{1,2,3,4,5},
				{6,7,8}
			},
			{
				{9,10,11,12,13},
				{14,15,16}
			},
			{
				{17,18,19,20}
			}
		};
		//System.out.println(getFactorial(5));
		//System.out.println(isPrime(5));
		printArray(a);
		System.out.println("=============");
		printArray(b);
		System.out.println("=============");
		A fsm = new A();
		int[] c = new int[] { 10,  -70000, -90000, -600000,-500000, -32769 };
		System.out.println(fsm.findSecMax(c));
	}
	public static long getFactorial(int n){
		if(n == 1) 
			return 1;
		return getFactorial(n-1) * n;
	}
	public static boolean isPrime(int n){
		int i;
		for(i = 2;i <= n/2;i++){
			if(n % i == 0)
				break;
		}
		if(i > n/2){
			return true;
		}else{
			return false;
		}
	}
	public static void printArray(int[][] a){
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void printArray(int[][][] a){
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a[i].length;j++){
				for(int k = 0;k < a[i][j].length;k++){
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public int findSecMax(int[] data){
		int maxNum = 0;
		int secMaxNum = 0;
		//先将前两个元素按大小分别赋给第一大和第二大的数
		if(data.length < 2)
			return -1;
		if(data[0] >= data[1]) {
			maxNum = data[0];
			secMaxNum = data[1];
		}else{
			maxNum = data[1];
			secMaxNum = data[0];
		}
		//从第三个开始循环，如果元素大于最大值，则最大值更新，原最大值赋给第二大值
		//如果该元素不大于最大值，且大于第二大的值，则第二大的值更新
		for (int i = 2; i < data.length; i++) {
			if (data[i] > maxNum) {
				secMaxNum = maxNum;
				maxNum = data[i];
			} else {
				if (data[i] >= secMaxNum) {
					secMaxNum = data[i];
				}
			}
		}
		return secMaxNum;
	}
}
