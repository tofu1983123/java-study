package corelesson3;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		System.out.println(list);
		//list.add(100);
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("1========================");
		//反射都是绕过编译操作
		/*验证1:
		 * */
		ArrayList list2 = new ArrayList();
		//结果是true,说明类类型是一样的,那么编译后是去泛型化的
		System.out.println(list.getClass() == list2.getClass());//true
		System.out.println(list.getClass() == ArrayList.class);
		/*验证2:用add的反射方法来进行操作*/
		try {
			Method method = list.getClass().getMethod("add", new Class[]{Object.class});
			method.invoke(list, new Object[]{100});
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list.size());
		System.out.println(list);
		//现在再用forEach遍历就会有异常
		/*for (String str : list) {
			System.out.println(str);
		}*///平时没有必要这样做.
	}

}
