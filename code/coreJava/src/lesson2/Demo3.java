package lesson2;

public class Demo3 {

	public static void main(String[] args) {
		Student student = new Student(1000,"zhangsan",18,"��ӮJAVA1��");
		Student student2 = new Student(1000,"zhangsan",18,"��ӮJAVA1��");
		/*������ʵ��Ӧ�õ���һ��ϰ��,���Ĭ�϶���ͨ��equals�������Ƚ���������
		 * �������true,����ͬһ������,false��Ϊ����
		 * ��ʵ��Ӧ����,��������Ψһ��ʶ,��Ӧ����Ψһ��ʶ��
		 * ����equals������hashCode����(��ʱ�����ĺ�һ������)
		 */
		System.out.println(student.equals(student2));
		System.out.println(student);
	}

}
