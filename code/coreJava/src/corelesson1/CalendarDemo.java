package corelesson1;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		System.out.println(getLastDayOfMonth(new Date()));
//		Calendar a = Calendar.getInstance();
//		a.set(Calendar.DATE,1);//����������Ϊ���µ�һ��
//		a.roll(Calendar.DATE,-1);//���ڻع�һ�죬Ҳ�������һ��
//		int MaxDate = a.get(Calendar.DATE);
//		System.out.println("�����������:" + MaxDate);
	}

	private static void test1() {
		//Calendar�ǳ�����,��ȡ��������Ķ���
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		//��ȡ���и�ʱ����ص���Ϣ
	}
	private static void test2(){
		String s = "1998-10-10";
		Date date = DateDemo.stringToDate(s);
		Calendar c = Calendar.getInstance();
		//c.setTime(date);
		c.setTimeInMillis(date.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
	}
	//�����Ӷ����,��ȡת������ --->ת������
	private static void test3(){
		//��Ӷ����		
		String s = "1998-10-10";
		Date date = DateDemo.stringToDate(s);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//ת������
		c.add(Calendar.MONTH, 3);
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;
		int d = c.get(Calendar.DATE);
		System.out.println("ת��������:"+y+"��"+m+"��"+d+"��");
	}
	 public static Date getLastDayOfMonth(Date sDate1){
        Calendar cDay1 = Calendar.getInstance();
        cDay1.set(Calendar.DAY_OF_MONTH,cDay1.getActualMaximum(Calendar.DAY_OF_MONTH));
        final int lastDay = cDay1.getActualMaximum(Calendar.DAY_OF_MONTH);
        Date lastDate = cDay1.getTime();
        lastDate.setDate(lastDay);
        return lastDate;
	}
}
