package corelesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		Product product1 = new Product("001","��Ӯjava�γ�",10000);
		Product product2 = new Product("002","��Ӯandroid�γ�",12000);
		Product product3 = new Product("003","��Ӯui�γ�",9000);
		/*���Ͳ���,ָ��products���������ֻ���Product���͵�ʵ��
		 * �ŵ�:1.�ڱ���׶η�ֹ��������
		 *     2.ʵ�ʲ����в���Ҫ��ǿ������ת��
		 * */
		ArrayList<Product> products = new ArrayList<Product>();
		//products.add("hello");//���벻ͨ��
		products.add(product1);
		products.add(product2);
		products.add(product3);
		//for����
		for(int i = 0;i < products.size();i++){
			System.out.println(products.get(i));
		}
		System.out.println("1========================");
		//����������
		Iterator<Product> itor = products.iterator();
		while(itor.hasNext()){
			Product pro = itor.next();
			System.out.println(pro);
		}
		System.out.println("2========================");
		//foreach����
		for(Product product:products){
			System.out.println(product);
		}
	}

}
