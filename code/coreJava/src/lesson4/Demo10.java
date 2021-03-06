package lesson4;

public class Demo10 {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			/*如果产生异常是ArrayIndexOutOfBoundsException的类型,
			 * 产生的对象就给catch中Exception类型接收了.
			 * 父类的引用,引用了子类的实例
			 * 传递的信息也是可靠的
			 * */
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e);//e.toString();异常类型+message
			e.printStackTrace();//异常类型+message+异常是在哪个类的哪个方法产生的
		}

	}

}
