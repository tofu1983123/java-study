/*
	˫ɫ�� 6�ź���(33ѡ1),1������(16ѡ1)
*/
import java.util.Random;
import java.util.Arrays;
class StringDemo2 
{
	public static void main(String[] args) 
	{
		//boolean[] b = new boolean[1];
		//System.out.println(b[0]);//��ӡ�����:false
		String[] balls = getBalls();
		System.out.println(Arrays.toString(balls));
	}
	public static String[] getBalls(){
		String[] pool = {
			"01","02","03","04","05","06","07","08",
			"09","10","11","12","13","14","15","16",
			"17","18","19","20","21","22","23","24",
			"25","26","27","28","29","30","31","32","33"
		};
		//��һ��������������ɫ����
		String[] balls = new String[6];
		int length = 0;//���ڼ���
		/*��pool���������ѡȡ6����,����������,���Ҳ������ظ�
		1.��������ȡ
			Random r = new Random();
			r.nextInt();//ȡ��0��n֮������������,
			ֻҪ��ȡ�����pool�±�ʹ���ָ������
		2.��β��ظ�
			һ���±����ʹ�����Ǹ�����һ����ʶ ʶ��
			boolean[] flag = new boolean[pool.length];������Ԫ��Ĭ��ֵ��false
			
		*/
		boolean[] used = new boolean[pool.length];
		Random r = new Random();
		while(true){
			int index = r.nextInt(pool.length);
			if(used[index])//˵�����±��Ѿ���ʹ�ù�
				continue;
			balls[length++] = pool[index];//��һ��С���,length++,��ѡ�е������balls����
			used[index] = true;//��ѡ�е����ʶΪ�Ѿ�ʹ�ù�.
			if(length == balls.length)
				break;
		}
		//��ɫ����ѡ��
		Arrays.sort(balls);
		//����1���ռ�,���һ��������
		balls = Arrays.copyOf(balls,balls.length+1);
		//��ɫ����16ѡ1����
		balls[balls.length-1] = pool[r.nextInt(16)];
		return balls;
	}
}
