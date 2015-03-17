package corelesson2;

public class ClassDemo {

	public static void main(String[] args) {
		A a1 = new A();
		/*表示了A类的类类型---->A类本身也是一个对象
		 * 分析一下:也可以认为是字节码(自己理解的)
		 * */
		Class c = A.class;
	}

}
class A{}