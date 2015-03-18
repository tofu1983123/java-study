package corelesson2;

import java.lang.reflect.Field;

public class FieldReflectDemo2 {

	public static void main(String[] args) {
		User u = new User("zhangsan",30);
		changeValue(u);
		System.out.println(u.getName()+","+u.getAge());
	}
	/*
	 * �޸Ķ��������
	 * �ַ�������ֵȫ����ɴ�д
	 * int���͵�����ֵȫ������100
	 * */
	public static void changeValue(Object object){
		/*
		 * object��������Щ���Բ������
		 * ����������Ҫ��������������
		 * �ҳ�����String���͵�,int���͵�����
		 * �ҵ�����֮��,ͨ����Ա�����ķ������
		 * */
		//1.�Ȼ�ȡ������
		Class c = object.getClass();
		//2.��ȡ���е�����
		Field[] fs = c.getDeclaredFields();
		//3.�������е�����
		for (Field field : fs) {
			//4.�õ����Ե�����
			Class fieldType = field.getType();
			//5.�ж�
			/*if(fieldType.getSimpleName().equals("String")){
			}
			if(fieldType.getSimpleName().equals("int")){
			}*/
			try {
				if(fieldType == String.class){
					//6.��Ա��������Ĳ���
					field.setAccessible(true);
					String oldValue = (String)field.get(object);
					field.set(object, oldValue.toUpperCase());
				}
				if(fieldType == int.class){
					field.setAccessible(true);
					int oldValue = (Integer)field.get(object);
					field.set(object, oldValue+100);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
