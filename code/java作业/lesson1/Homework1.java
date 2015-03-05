/*
	作业1:托运计费问题
	当货物总量小于20公斤的时候,收费5元,大于20公斤
	小于100公斤的时候超出20公斤的部分按每0.2元
	每公斤计费,如果超出100公斤的时候,超出的部分
	按照每公斤0.15元计算.读入货物的重量,输出计算
	之后货物的运费.
*/
import java.util.Scanner;
class Homework1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入货物重量(公斤):");
		double weight = s.nextDouble();
		double freight = 0;
		if(weight <= 20 && weight > 0){
			freight = 5;
		}else if(weight > 20 && weight <= 100){
			freight = 5 + (weight - 20)*0.2;
		}else if(weight > 100){
			freight = 5 + 80 * 0.2 + (weight - 100)*0.15;
		}else{
			System.out.println("输入的货物重量有误!");
		}
		if(freight > 0)
			System.out.println("货物的运费是:"+freight+"元");
	}
}
