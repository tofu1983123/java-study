package corelesson2;

import java.lang.reflect.Field;

public class FieldReflectDemo2 {

	public static void main(String[] args) {
		User u = new User("zhangsan",30);
		changeValue(u);
		System.out.println(u.getName()+","+u.getAge());
	}
	/*
	 * 修改对象的属性
	 * 字符串属性值全部变成大写
	 * int类型的属性值全部加上100
	 * */
	public static void changeValue(Object object){
		/*
		 * object对象有哪些属性并不清楚
		 * 所有我们需要遍历其所有属性
		 * 找出属于String类型的,int类型的属性
		 * 找到属性之后,通过成员变量的反射操作
		 * */
		//1.先获取类类型
		Class c = object.getClass();
		//2.获取所有的属性
		Field[] fs = c.getDeclaredFields();
		//3.遍历所有的属性
		for (Field field : fs) {
			//4.得到属性的类型
			Class fieldType = field.getType();
			//5.判断
			/*if(fieldType.getSimpleName().equals("String")){
			}
			if(fieldType.getSimpleName().equals("int")){
			}*/
			try {
				if(fieldType == String.class){
					//6.成员变量反射的操作
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
