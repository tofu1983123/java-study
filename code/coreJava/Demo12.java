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
	/*h,ageֻ��������ڲ�����,����������Ӧ�����{}�ڷ���
	  �����г�Ա,һ����˵����ֻ��ͨ����ĳ�Ա��������
	  �����ĳ�Ա����������ⲿֱ�ӱ�ʹ�þͿ���ֱ�����ó�private
	  ͨ��������private�ķ���,��ӷ���
	*/
	void setH(int h){
		this.h = h;
	}
	int getH(){
		return h;
	}
}