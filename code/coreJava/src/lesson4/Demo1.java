package lesson4;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * 下一行代码是有可能产生异常的
		 * eclipse既然没报错,说明能通过编译
		 * 说明下面的异常,其实jvm可以自动处理
		 * 当然也可以自己处理---->可以给出更友好的提示
		 * */
		try {
			/*
			 * 可能会产生异常的代码
			 * 一旦出现异常,就会产生一个异常对象
			 * */
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界!");
		}
		/*以下必须自己处理否则编译不通过*/
		//FileInputStream in = new FileInputStream("aa.txt");
		
	}

}
