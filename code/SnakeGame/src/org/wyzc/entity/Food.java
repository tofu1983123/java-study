package org.wyzc.entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import org.wyzc.util.Global;

/**
 * ʳ��
 * @author Administrator
 *
 */
public class Food extends Point {
	public void drawMe(Graphics g){
		System.out.println("ʳ�����ڻ����Լ�...");
		g.setColor(Color.red);
		g.fill3DRect(x*Global.CELL_SIZE, y*Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE, true);
	}
	/**
	 * ���Ƿ�Ե�ʳ��
	 * ֻҪ�ж���ͷ�ĵ��Ƿ��ʳ���λ���Ƿ��غ�
	 * Ҫ�õ���ͷ
	 * @param snake
	 * @return
	 */
	public boolean isEatBySnake(Snake snake){
		System.out.println("�ж����Ƿ�������ʳ��");
		Point head = snake.getHead();
		if(this.equals(head))
			return true;
		return false;
	}
	public void addFood(Point p){
		this.x = p.x;
		this.y = p.y;
	}
}
