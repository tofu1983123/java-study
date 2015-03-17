package corelesson1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		//test1();
		//System.out.println(formatDate(new Date()));
		String s = "1998-10-10";
		Date date = stringToDate(s);
		System.out.println(date.getTime());
	}
	public static void test1(){
		Date date = new Date();
		System.out.println(date);
		//从1900年最为基础开始的
		System.out.println(date.getYear()+1900);
		//month从0到11代表1月到12月
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
		//过时的方法不要去用了
		
		//返回自1970年1月1日00:00:00GMT 以来此Date对象表示的毫秒数.
		System.out.println(date.getTime());
		//System.out.println(System.currentTimeMillis());
	}
	public static void test2(){
		Date date = new Date();
		System.out.println(date);
	}
	public static String formatDate(Date date){
		//MM代表月  mm代表分  hh代表12小时制  HH代表24小时制
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf.format(date);
	}
	public static Date stringToDate(String string){//字符串转换成日期对象
		//调用函数传递来的字符串必须和SimpleDateFormat中的格式相同
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(string);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}
	}
}
