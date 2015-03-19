package corelesson2;

import java.lang.reflect.Array;

public class ArrayReflectDemo4 {

	public static void main(String[] args) {
		test(new int[]{1,2,3});
		test("hello");
		System.out.println("====================");
		printObject(new int[]{1,2,3});
		System.out.println("====================");
		printObject(new String[][]{{"hello","world"},{"aaa","bbb"}});
	}
	public static void test(Object obj){
		Class c = obj.getClass();
		//�ж϶����ǲ�������
		System.out.println(c.isArray());
	}
	/*
	 * ���Object�Ƿ��������,ֱ�Ӵ�ӡtoString
	 * ���Object������,��ӡ�����е�ÿ��Ԫ��
	 * */
	public static void printObject(Object object){
		//�ж��Ƿ�Ϊ����
		Class c = object.getClass();
		if(c.isArray()){
			//��ȡ���鳤��
			int length = Array.getLength(object);
			//���������Ԫ��
			for(int i = 0;i < length;i++){
				//��ȡ�����е�ÿ��Ԫ��
				Object obj = Array.get(object, i);
				//�����е�ÿ��Ԫ�ؿ�������һ������ �ݹ�
				printObject(obj);
			}
		}else{
			System.out.println(object.toString());
		}
	}
}
