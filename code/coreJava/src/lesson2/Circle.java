package lesson2;

public class Circle extends Shape{
	/*java�еļ̳���ȫ���̳�,��ʹprivateҲ�̳�
	 * private�̳й���֮��,����ֱ�ӷ���,ֻ��ͨ��
	 * �̳й����ĸ���ķ�private��������
	 * 
	 * */
	private double r;
	public Circle(Point Location,double r) {
		super(Location);
		this.r = r;
		// TODO �Զ����ɵĹ��캯�����
	}
	public double getArea(){
		return 3.14 * r * r;
	}
	public double getLength(){
		return 2 * 3.14 * r;
	}
	public boolean contains(Point p){
		return this.getLocation().getDistance() <= r;
	}
	public void printData() {
		// TODO �Զ����ɵķ������
		super.printData();
		System.out.println("�뾶��:"+r);
	}
}
