package lesson4;

import java.io.IOException;

public class Demo8 {

	public static void main(String[] args) {

	}
}

class A {
	public void test1() throws IOException, ClassNotFoundException {

	}
}

class B extends A {
	/*
	 * public void test1() throws
	 * IOException,ClassNotFoundException,NumberFormatException{
	 * 
	 * }
	 */
	// 可以throws更多的部分只能是RuntimeException类型的或者其子类 Ok
	/*
	 * public void test1(){ }//throws比父类的少, 也是Ok的
	 */
	/*public void test1() throws IOException, ClassNotFoundException,
			CloneNotSupportedException {
	}*///错误的,throws了比父类更多的异常
}