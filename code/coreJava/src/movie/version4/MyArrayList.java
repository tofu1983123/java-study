package movie.version4;

import java.util.Arrays;

public class MyArrayList {
	private Object[] objects = new Object[10];
	private int index = 0;//��¼��ЧԪ��
	//������������Ԫ��,ÿ�ζ����������һ����Чλ��
	public void add(Object object){
		if(index == objects.length)
			expand();
		objects[index++] = object;
	}
	private void expand(){
		objects = Arrays.copyOf(objects, objects.length * 2);
	}
	public Object[] getObjects() {
		return objects;
	}
	/**
	 * ͨ���±��ȡĳ��Ԫ��
	 * @param index �±�
	 * @return Ԫ��
	 */
	public Object get(int index){
		if(index < 0 || index >= this.index)//���ܳ�����ЧԪ�صķ�Χ
			throw new ArrayIndexOutOfBoundsException();
		return objects[index];
	}
	/**
	 * ��ȡĳ��������±�
	 * @param object
	 * @return
	 */
	public int getDataIndex(Object object){
		for(int i = 0;i < index;i++){
			if(object.equals(objects[i]))
				return i;
		}
		return -1;
	}
	public boolean contains(Object object){
		for(int i = 0;i < index;i++){
			if(object.equals(objects[i]))
				return true;
		}
		return false;
	}
	public int getIndex() {
		return index;
	}
	public Iterator iterator(){
		return new MyIterator();
	}
	private class MyIterator implements Iterator{
		private int size = 0;
		public Object getCurrent() {
			return objects[size];
		}
		public boolean isDone() {
			return size == index;
		}
		public void next() {
			size++;
		}
	}
}