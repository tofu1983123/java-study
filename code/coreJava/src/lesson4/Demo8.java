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
	// ����throws����Ĳ���ֻ����RuntimeException���͵Ļ��������� Ok
	/*
	 * public void test1(){ }//throws�ȸ������, Ҳ��Ok��
	 */
	/*public void test1() throws IOException, ClassNotFoundException,
			CloneNotSupportedException {
	}*///�����,throws�˱ȸ��������쳣
}