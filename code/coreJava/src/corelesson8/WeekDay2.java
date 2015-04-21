package corelesson8;
public enum WeekDay2 {
	/*
	 * 枚举的对象必须罗列在类的最前面
	 * 切用逗号隔开,如果下面没有其他元素最后可以没有符号
	 * 如果除了罗列的对象还有其他元素,必须;结束
	 * 枚举类构造函数默认就是private的,如果你没有这样声明也认为是private
	 * 如果声明为public 编译不通过.
	 * 
	 * 罗列出的每个对象都是public static final的
	 * */
	MON,TUE,WED,THU,FRI,SAT,SUN;
	WeekDay2(){}//private WeekDay2(){}
	//public WeekDay2(){}//直接报错
}
