class ClassDemo14 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.getPerson().getPerson().getPerson().getPerson().print();//h����4��,�����4
	}
}
class Person
{
	int h;
	Person getPerson(){//���������ķ���ֵ����������,��ô���ص��Ǹ���Ķ���(������)
		h++;//��Ա�������ʳ�Աǰ��ʡ����this  this.h++
		return this;//��������������Ǹ�����(�������p1)
	}
	void print(){
		System.out.println(h);
	}
}