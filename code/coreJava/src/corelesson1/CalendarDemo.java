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
//		a.set(Calendar.DATE,1);//把日期设置为当月第一天
//		a.roll(Calendar.DATE,-1);//日期回滚一天，也就是最后一天
//		int MaxDate = a.get(Calendar.DATE);
//		System.out.println("该月最大天数:" + MaxDate);
	}

	private static void test1() {
		//Calendar是抽象类,获取的是子类的对象
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		//获取所有跟时间相关的信息
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
	//输入雇佣日期,获取转正日期 --->转正日期
	private static void test3(){
		//雇佣日期		
		String s = "1998-10-10";
		Date date = DateDemo.stringToDate(s);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//转正日期
		c.add(Calendar.MONTH, 3);
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;
		int d = c.get(Calendar.DATE);
		System.out.println("转正日期是:"+y+"年"+m+"月"+d+"日");
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
