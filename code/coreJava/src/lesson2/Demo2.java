package lesson2;

public class Demo2 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;
		A a2 = new A();
		a2.i = 10;
		/*
		 * a1Ϊʲô�ܵ���equals����
		 * java.lang.Object��һ����ĸ���
		 * һ�������û�и���,��ô���ĸ������Object��
		 * Object���еķ����ͼ̳е���A����
		 * */
		System.out.println(a1.equals(a2));
		
		System.out.println(a1);
		//��ӡ����,ֱ�Ӵ�ӡ�����toString�����ķ���ֵ
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
	}//�͸���̳й����ķ�������������,�ͽ�ԭ��,�����ȷ������
	*/
	public boolean equals(Object Obj){
		//A xx = (A)Obj;//�������� ��ȷ��A����ʵ��������,�Ϳ���ǿ��ת��
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