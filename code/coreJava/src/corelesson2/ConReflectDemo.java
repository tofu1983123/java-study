package corelesson2;

import java.lang.reflect.Constructor;

public class ConReflectDemo {

	public static void main(String[] args) {
		try {
			Class c = Student.class;
			//获取无参数的构造方法
			Constructor constructor = c.getConstructor(new Class[]{});
			//通过构造函数的反射创建对象
			Student stu = (Student)constructor.newInstance(new Object[]{});
			stu.setAge(30);
			System.out.println(stu.getAge());
			System.out.println("1=======================");
			Constructor constructor2 = c.getConstructor(new Class[]{String.class,int.class});
			Student stu2 = (Student)constructor2.newInstance(new Object[]{"zhangsan",30});
			System.out.println(stu2.getName()+","+stu2.getAge());
			System.out.println("2=======================");
			Constructor<Student> constructor3 = c.getConstructor(new Class[]{});
			Student student1 = constructor3.newInstance(new Object[]{});
			
			Constructor<Student> constructor4 = c.getConstructor(new Class[]{String.class,int.class});
			Student student2 = constructor4.newInstance(new Object[]{"zhangliu",20});
			System.out.println(student2.getName()+","+student2.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Student{
	private String Name;
	private int age;
	public Student(){}
	public Student(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
