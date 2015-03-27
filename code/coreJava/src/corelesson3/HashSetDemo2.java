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
		stu1.setName("000x");//�޸ĸ����Ժ�,�����Ƴ�����
		students.remove(stu1);
		System.out.println(students.size());
		System.out.println("1====================");
		/*
		 * HashSet���Ԫ�ص�ʱ��,Ԫ�ص�λ���ǺͶ���hashCode�㷨�õ���ֵ��ص�.
		 * ��ôȥ����Ԫ��ʱ,ҲҪ��������㷨��ֵ,Ȼ���ҵ����λ��,�Ƴ�Ԫ��,���û��
		 * Ԫ�صĴ���,remove��������false.
		 * ��������㷨��ص�����ֵ�ڷ����������޸���,��ζ��hashCode�㷨�õ���ֵ
		 * ��֮ǰ��������ʱ��һ����,�Ҷ����λ�þͷ����˸ı�,�Ӷ��Ҳ���֮ǰ�Ķ���,
		 * ����Ԫ�ز����Ƴ�.�ö���֮,������ڴ�й¶.
		 * */
	}

}
