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
	//����a�Ѿ���С�������������,����value���Ǵ�С��������
	public static int[] insertValue(int[] a,int value){
		a = Arrays.copyOf(a,a.length+1);
		/*
			�����һ��Ԫ�ؿ�ʼ��value���бȽ�,�����value��,��ЩԪ�ض�����
			һֱ��value���������ĳ��Ԫ��,��ô˵��value��Ӧ�÷������Ԫ��֮��
		*/
		int i;
		for(i = a.length-2;i >= 0;i--){
			if(value < a[i]){
				a[i+1] = a[i];//���ƶ�
			}else{
				break;
			}
		}
		a[i+1] = value;
		return a;
	}
	//��������
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
