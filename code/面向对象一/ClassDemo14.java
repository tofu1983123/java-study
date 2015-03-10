class ClassDemo14 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.getPerson().getPerson().getPerson().getPerson().print();//h加了4次,结果是4
	}
}
class Person
{
	int h;
	Person getPerson(){//看到函数的返回值类型是类名,那么返回的是该类的对象(的引用)
		h++;//成员函数访问成员前面省略了this  this.h++
		return this;//调用这个函数的那个对象(这里就是p1)
	}
	void print(){
		System.out.println(h);
	}
}