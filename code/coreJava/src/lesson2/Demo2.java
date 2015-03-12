package lesson2;

public class Demo2 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;
		A a2 = new A();
		a2.i = 10;
		/*
		 * a1为什么能调用equals方法
		 * java.lang.Object是一切类的父类
		 * 一个类如果没有父类,那么它的父类就是Object类
		 * Object类中的方法就继承到了A类中
		 * */
		System.out.println(a1.equals(a2));
		
		System.out.println(a1);
		//打印对象,直接打印对象的toString方法的返回值
	}
}
class A{
	int i;	
	/*
	 * public boolean equals(Object obj) {
        return (this == obj);
    }
	 * */
	/*public boolean equals(A aa){
		return this.i == aa.i;		
	}//和父类继承过来的方法构成了重载,就近原则,调用最精确的类型
	*/
	public boolean equals(Object Obj){
		//A xx = (A)Obj;//穿过来的 的确是A对象实例的引用,就可以强制转换
		if(Obj instanceof A){
			A xx = (A)Obj;
			return this.i == xx.i;
		}
		return false;
	}
	public String toString(){
		return i+"";
	}
}