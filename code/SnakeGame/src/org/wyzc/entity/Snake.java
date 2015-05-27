package org.wyzc.entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

import org.wyzc.listener.SankeListener;
import org.wyzc.util.Global;

/**
 * ��
 * @author Administrator
 *
 */
public class Snake {
	private SankeListener snakeListener;
	private boolean life = true;
	private LinkedList<Point> body = new LinkedList<Point>();
	public static final int UP = 1;
	public static final int DOWN = -1;
	public static final int LEFT = 3;
	public static final int RIGHT = -3;
	//private int direction;//�洢��ǰ����
	private int oldDirection,newDirection;
	private Point tail;//�洢β��
	public Snake(){
		init();
	}
	private void init(){
		int x = Global.WIDTH/2;
		int y = Global.HEIGHT/2;
		for(int i = 0;i < 3;i++){
			body.add(new Point(x-i,y));
		}
		this.oldDirection = this.newDirection = RIGHT;
	}
	/**
	 * ���ƶ��ķ���
	 */
	public void move(){
		//ȥβ��
		tail = body.removeLast();
		//��ͷ---->��Ҫ�õ���ǰ��ͷ��
		int x = body.getFirst().x;
		int y = body.getFirst().y;
		/*
		 * ����µ�ͷ��
		 * Ҫȷ������,����֪���µ�ͷ��
		 * �ڳ�ʼ�����������ʱ��,Ĭ�ϵķ�����ʵ��Ϊ�����ҵ�.
		 * ���Ƕ�������еķ���.
		 * �����changeDirection����
		 * */
		if(this.oldDirection + this.newDirection != 0)
		this.oldDirection = this.newDirection;
		switch (oldDirection) {
		case UP:
			y--;
			if(y < 0)
				y = Global.HEIGHT - 1;
			break;
		case DOWN:
			y++;
			if(y >= Global.HEIGHT)
				y = 0;
			break;
		case LEFT:
			x--;
			if(x < 0)
				x = Global.WIDTH - 1;
			break;
		case RIGHT:
			x++;
			if(x >= Global.WIDTH)
				x = 0;
			break;
		}
		body.addFirst(new Point(x,y));
		System.out.println("�������ƶ�...");
	}
	/**
	 * �߳�ʳ��ķ���
	 * ȥ����β�ͼӻ�������
	 * @param food
	 */
	public void eatFood(Food food){
		body.addLast(tail);
		System.out.println("�����ڳ�ʳ��...");
	}
	/**
	 * �߸ı䷽��ķ���
	 */
	public void changeDirection(int direction){
		this.newDirection = direction;
		System.out.println("�����ڸı䷽��...");
	}
	/**
	 * �߻����Լ��ķ���
	 */
	public void drawMe(Graphics g){
		System.out.println("�����ڻ����Լ�...");
		g.setColor(Color.blue);
		for(Point p:body){
			g.fill3DRect(p.x*Global.CELL_SIZE, p.y*Global.CELL_SIZE, Global.CELL_SIZE, Global.CELL_SIZE, true);
		}
	}
	/**
	 * ���Ƿ�Ե��Լ�
	 * @return
	 */
	public boolean isEatSelf(){
		for(int i = 1;i < body.size();i++){
			if(body.get(i).equals(getHead())){
				return true;
			}
		}
		return false;
	}
	public void addSnakeListener(SankeListener snakeListener){
		if(snakeListener != null){
			this.snakeListener = snakeListener;
		}
	}
	public void start(){
		new SnakeDriver().start();
	}
	/**
	 * ��ȡ��ͷ
	 * @return
	 */
	public Point getHead(){
		return body.getFirst();
	}
	public void setLife(boolean life) {
		this.life = life;
	}
	private class SnakeDriver extends Thread{
		public void run() {
			while(true){
				move();
				snakeListener.snakeMoved(Snake.this);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
