class Demo12 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		//p1.h = 175;
		p1.setH(175);
		System.out.println(p1.getH());
	}
}
class Person
{
	private int h,age;
	/*h,age只能在类的内部访问,就是类所对应的类的{}内访问
	  类中有成员,一般来说就是只能通过类的成员函数访问
	  如果类的成员不想在类的外部直接被使用就可以直接设置成private
	  通过其他非private的方法,间接访问
	*/
	void setH(int h){
		this.h = h;
	}
	int getH(){
		return h;
	}
}