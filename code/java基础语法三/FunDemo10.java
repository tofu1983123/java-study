/*
	дһ����������һ�����ݵĽ׳ˡ��õݹ鴦��
*/
class FunDemo10
{
	public static void main(String[] args) 
	{
		System.out.println(jiecheng(5));
	}
	//�׳� n! = (n - 1)! * n;
	public static long jiecheng(int n){
		int t = 1;
		for(int i = 1;i <= n;i++){
			t *= i;
		}
		return t;
	}

	public static long jiecheng1(int n){
		if(n == 1)
			return 1;
		return jiecheng1(n-1) * n;//�Լ������Լ�,����ջ���Ƚ������ԭ��
	}
}
