/*
	双色球 6颗红球(33选1),1颗蓝球(16选1)
*/
import java.util.Random;
import java.util.Arrays;
class StringDemo2 
{
	public static void main(String[] args) 
	{
		//boolean[] b = new boolean[1];
		//System.out.println(b[0]);//打印结果是:false
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
		//用一个数组存放六个蓝色的球
		String[] balls = new String[6];
		int length = 0;//用于计数
		/*从pool数组中随机选取6个球,放入数组中,并且不能有重复
		1.如何随机的取
			Random r = new Random();
			r.nextInt();//取得0到n之间的随机的整数,
			只要获取随机的pool下标就代表指定的球
		2.如何不重复
			一个下标的球被使用我们给它加一个标识 识别
			boolean[] flag = new boolean[pool.length];数组中元素默认值是false
			
		*/
		boolean[] used = new boolean[pool.length];
		Random r = new Random();
		while(true){
			int index = r.nextInt(pool.length);
			if(used[index])//说明该下标已经被使用过
				continue;
			balls[length++] = pool[index];//放一个小球后,length++,把选中的球放入balls数组
			used[index] = true;//把选中的球标识为已经使用过.
			if(length == balls.length)
				break;
		}
		//红色的球选完
		Arrays.sort(balls);
		//扩容1个空间,最后一个放蓝球
		balls = Arrays.copyOf(balls,balls.length+1);
		//蓝色的球16选1即可
		balls[balls.length-1] = pool[r.nextInt(16)];
		return balls;
	}
}
