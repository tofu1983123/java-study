class ClassDemo2
{
	public static void main(String[] args) 
	{
		Clock c = new Clock();
		c.h = 10;
		c.m = 10;
		c.s = 10;
		c.showTime();
		Clock c2 = new Clock();
		c2.setTime();
		c2.showTime();
	}
}
class Clock
{
	int h,m,s;
	void setTime(){
		h = 10;
		m = 10;
		s = 10;
	}
	void showTime(){
		System.out.println(h+":"+m+":"+s);
	}
}