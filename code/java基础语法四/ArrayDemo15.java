import java.util.Arrays;
class ArrayDemo15 
{
	public static void main(String[] args) 
	{
		//int[] a = {10,20,30,40,50};
		//a = insertValue(a,25);
		
		int[] a = {10,20,30,40,50};
		a = sort(a);
		System.out.println(Arrays.toString(a));
	}
	//数组a已经从小到大进行了排序,插入value还是从小到大排序
	public static int[] insertValue(int[] a,int value){
		a = Arrays.copyOf(a,a.length+1);
		/*
			从最后一个元素开始和value进行比较,如果比value大,这些元素都后移
			一直到value大于数组的某个元素,那么说明value就应该放在这个元素之后
		*/
		int i;
		for(i = a.length-2;i >= 0;i--){
			if(value < a[i]){
				a[i+1] = a[i];//后移动
			}else{
				break;
			}
		}
		a[i+1] = value;
		return a;
	}
	//插入排序
	public static void sort(int[] a){
		int t,j;
		for(int i = 1;i < a.length;i++){
			t = a[i];
			/*for(j = i-1;j >= 0;j--){
				if(t < a[j]){
					a[j+1] = a[j];
				}else{
					break;
				}
			}*/
			for(j = i-1;j >=0 && t < a[j];j--){
				a[j+1] = a[j];
			}
			a[j+1] = t;
		}
	}
}
