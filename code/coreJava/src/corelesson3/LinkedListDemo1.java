package corelesson3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("xxx");
		list.add("aaa");
		list.add("hello");
		list.add("world");
		System.out.println(list.size());
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("1====================");
		Iterator<String> itor = list.iterator();
		while(itor.hasNext()){
			System.out.println(itor.next());
		}
		System.out.println("2====================");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println("3====================");
		list.addFirst("start");
		list.addLast("end");
		System.out.println(list);
	}

}
