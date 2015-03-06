/*
	������������֮����������
	˼·:����1998-10-10,2010-5-5
		���Ȼ�ȡ1998-10-10�����������һ�껹ʣ������
		�ٴλ�ȡ2010-5-5�����������һ���Ѿ����˶�����
		Ȼ���ȡ99�굽09���м����������
		1.дһ������,�ж���һ���Ƿ�Ϊ����
		public static boolean isLeap(int y)
		2.дһ������,����һ����������һ���Ѿ����˶�����
		public static int getDays(int y,int m,int d)
		3.дһ������,����һ����������һ�껹ʣ�¶�����.
		������ - �Ѿ���ȥ�� = ʣ�µ�����
		public static int otherDays(int y,int m,int d)
		4.дһ������,ֱ�Ӽ�������������������.
		public static int subDays(int y1,int m1,int d1,int y2,int m2,int d2)

		һ���Ǽ���С�����Ѿ�ʣ�µ�,������Ѿ�����,�м�����������.
*/
class FunDemo8 
{
	public static void main(String[] args) 
	{
		//System.out.println(getDays(2000,4,20));
		System.out.println(subDays(1999,1,5,2001,1,10));
	}
	//�ж���һ���Ƿ�Ϊ����
	public static boolean isLeap(int y){
		if(y%4 == 0 && y%100 != 0 || y%400 == 0)
			return true;
		//else ����ʡ��,����ʡ��,���Լ�if-else,��ν�������߼��ֶ�
			return false;
	}
	//����һ����������һ���Ѿ����˶�����
	public static int getDays(int y,int m,int d){
		int sum = 0;
		switch(m -1)
		{
			case 11:sum += 30;
			case 10:sum += 31;
			case 9: sum += 30;
			case 8: sum += 31;
			case 7: sum += 31;
			case 6: sum += 30;
			case 5: sum += 31;
			case 4: sum += 30;
			case 3: sum += 31;
			case 2: 
				if(isLeap(y)){//һ����������������һ������,���Ǻ�������Ƕ������
					sum += 29;
				}else{
					sum += 28;
				}
			case 1: sum += 31;
		}
		sum += d;
		return sum;
	}
	//����һ����������һ�껹ʣ�¶�����
	public static int otherDays(int y,int m,int d){
		if(isLeap(y))
			return 366 - getDays(y,m,d);
		//else ����ʡ��
			return 365 - getDays(y,m,d);
	}
	public static int subDays(int y1,int m1,int d1,int y2,int m2,int d2){
		
		if(y1 == y2){//ֻҪ����y1���Ѿ�����-y2���Ѿ����ľ�������,�����Ǹ���
			int days1 = getDays(y1,m1,d1) - getDays(y2,m2,d2);
			return abs(days1);
		}else if(y1 < y2){
			//Ҫ�����,С����ʣ�µ�+������ȥ��+�м���
			int sum1 = otherDays(y1,m1,d1);
			int sum2 = getDays(y2,m2,d2);
			int sum3 = 0;
			for(int i = y1+1;i < y2;i++){
				if(isLeap(i))
					sum3 += 366;
				else
					sum3 += 365;
			}
			return sum1 + sum2 + sum3;
		}else{
			int sum1 = getDays(y1,m1,d1);
			int sum2 = otherDays(y2,m2,d2);
			int sum3 = 0;
			for(int i = y2+1;i < y1;i++){
				if(isLeap(i))
					sum3 += 366;
				else
					sum3 += 365;
			}
			return sum1 + sum2 + sum3;
		}
	}
	public static int abs(int n){
		return n >= 0 ? n : -n;
	}
}
