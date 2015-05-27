package org.wyzc.entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import org.wyzc.util.Global;

/**
 * 障碍物
 * @author Administrator
 *
 */
public class Ground {
	private int[][] rocks = new int[Global.WIDTH][Global.HEIGHT];
	public Ground(){
		for(int y = 0;y < Global.HEIGHT;y++){
			for(int x = 0;x < Global.WIDTH;x++){
				if(y == 0 || y == Global.HEIGHT - 1){
					rocks[y][x] = 1;
				}
				if(x == 0 || x == Global.WIDTH - 1){
					rocks[y][x] = 1;
				}
			}
		}
	}
	public void drawMe(Graphics g){
		System.out.println("障碍物正在画出自己...");
		g.setColor(Color.yellow);
		for(int y = 0;y < Global.HEIGHT;y++){
			for(int x = 0;x < Global.WIDTH;x++){
				if(rocks[y][x] == 1){
					g.fill3DRect(x*Global.CELL_SIZE, y*Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE, true);
				}
			}
		}
	}
	/**
	 * 蛇是否吃到碰到障碍物
	 * @param snake
	 * @return
	 */
	public boolean isEatBySnake(Snake snake){
		System.out.println("判断蛇是否碰到了障碍物");
		Point head = snake.getHead();
		for(int x = 0;x < Global.WIDTH;x++){
			for(int y = 0;y < Global.HEIGHT;y++){
				if(rocks[x][y] == 1 && head.x == x && head.y == y){
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * 设置食物点的位置
	 * @return
	 */
	public Point getPoint(){
		int x,y;
		do{
			x = new Random().nextInt(Global.WIDTH);
			y = new Random().nextInt(Global.HEIGHT);
		}while(rocks[x][y] == 1);
		return new Point(x,y);
	}
}
