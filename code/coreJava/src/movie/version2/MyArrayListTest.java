package movie.version2;

public class MyArrayListTest {

	public static void main(String[] args) {
		//创建影片
		Movie m1 = new Movie("我们曾经是战士");
		m1.setPriceCode(Movie.R_MOVIE);
		
		Movie m2 = new Movie("喜洋洋和灰太狼");
		m2.setPriceCode(Movie.CHILLDREN_MOVIE);
		
		Movie m3 = new Movie("全民目击");
		m3.setPriceCode(Movie.NEW_MOVIE);
		
		//租赁信息
		Rental r1 = new Rental(m1,2);
		Rental r2 = new Rental(m2,3);
		Rental r3 = new Rental(m3,3);
		
		MyArrayList list1 = new MyArrayList();
		list1.add(r1);
		list1.add(r2);
		list1.add(r3);
		list1.add(r1);
		
		Rental rental = (Rental)list1.get(0);
		System.out.println(rental);
		
		System.out.println(list1.getDataIndex(r2));
		System.out.println(list1.contains(r1));
		System.out.println("1====================");
		MyArrayList list2 = new MyArrayList();
		list2.add(m1);
		list2.add(m2);
		list2.add(m3);
		System.out.println(list2.contains(m2));
		System.out.println(list2.getIndex());
		System.out.println("2====================");
		
		//测试遍历list1
		Iterator itor = list1.iterator();
		while(!itor.isDone()){
			Rental rr = (Rental)itor.getCurrent();
			System.out.println(rr);
			itor.next();
		}
		System.out.println("3====================");
		Iterator itor2 = list2.iterator();
		while(!itor2.isDone()){
			 Movie movie = (Movie)itor2.getCurrent();
			System.out.println(movie.getName());
			itor2.next();
		}
	}

}
