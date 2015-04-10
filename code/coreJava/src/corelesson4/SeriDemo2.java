package corelesson4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SeriDemo2 {

	public static void main(String[] args) {
		try {
			//序列化
//			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:\\a.dat"));
//			C c = new C();
//			out.writeObject(c);
//			out.flush();
//			out.close();
			//反序列化
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\a.dat"));
			C c = (C)ois.readObject();
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
class A implements Serializable{//结果不调用父类的构造函数
	A(){System.out.println("a...");}
}
class B extends A{// implements Serializable 结果为输出:a...
	B(){System.out.println("b...");}
}
class C extends B{// implements Serializable 结果为输出:a... /n b...
	C(){System.out.println("c...");}
}