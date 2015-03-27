package corelesson3;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		Student stu1 = new Student("001","zhangsan",22);
		Student stu2 = new Student("002","lisi",23);
		Student stu3 = new Student("003","wangwu",22);
		HashSet<Student> students = new HashSet<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		System.out.println(students.size());
		stu1.setName("000x");//修改该属性后,对象移除不了
		students.remove(stu1);
		System.out.println(students.size());
		System.out.println("1====================");
		/*
		 * HashSet存放元素的时候,元素的位置是和对象hashCode算法得到到值相关的.
		 * 那么去查找元素时,也要根据这个算法的值,然后找到相关位置,移除元素,如果没有
		 * 元素的存在,remove方法返回false.
		 * 如果跟该算法相关的属性值在放入容器后被修改了,意味着hashCode算法得到的值
		 * 和之前放入容器时不一样了,找对象的位置就发生了改变,从而找不到之前的对象,
		 * 导致元素不能移除.久而久之,会产生内存泄露.
		 * */
	}

}
