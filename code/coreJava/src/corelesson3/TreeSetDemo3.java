package corelesson3;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		ts.add("hello");
		ts.add("world");
		ts.add("zhangsan");
		ts.add("lisi");
		ts.add("wangwu");
		System.out.println(ts);
	}

}
