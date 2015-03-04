/*
	continue,break关键字
*/
class ForDemo8 
{
	public static void main(String[] args) 
	{
		for(int i = 1;i <= 10;i++){
			if(i == 5){
				System.out.println("第"+i+"个包子掉在了地上");//结束本次循环,进行下一次循环
				continue;//去第三个表达式
			}
			if(i == 8){
				System.out.println("第"+i+"个包子又掉在了地上");
				//心情不好,都不想吃了.
				break;
			}
			System.out.println("我在吃第"+i+"个包子");
		}
		System.out.println("早饭吃完了!");
	}
}
