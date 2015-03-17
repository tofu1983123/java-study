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
		//��1900����Ϊ������ʼ��
		System.out.println(date.getYear()+1900);
		//month��0��11����1�µ�12��
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
		//��ʱ�ķ�����Ҫȥ����
		
		//������1970��1��1��00:00:00GMT ������Date�����ʾ�ĺ�����.
		System.out.println(date.getTime());
		//System.out.println(System.currentTimeMillis());
	}
	public static void test2(){
		Date date = new Date();
		System.out.println(date);
	}
	public static String formatDate(Date date){
		//MM������  mm�����  hh����12Сʱ��  HH����24Сʱ��
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf.format(date);
	}
	public static Date stringToDate(String string){//�ַ���ת�������ڶ���
		//���ú������������ַ��������SimpleDateFormat�еĸ�ʽ��ͬ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(string);
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return null;
		}
	}
}
