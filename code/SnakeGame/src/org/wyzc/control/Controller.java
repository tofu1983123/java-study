package org.wyzc.control;

import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JOptionPane;

import org.wyzc.entity.Food;
import org.wyzc.entity.Ground;
import org.wyzc.entity.Snake;
import org.wyzc.listener.SankeListener;
import org.wyzc.util.Global;
import org.wyzc.view.GamePanel;

public class Controller extends KeyAdapter implements SankeListener {
	/**
	 * ��������
	 */
	private Snake snake;
	private Food food;
	private Ground ground;
	private GamePanel gamePanel;
	public Controller(Snake snake, Food food, Ground ground, GamePanel gamePanel) {
		super();
		this.snake = snake;
		this.food = food;
		this.ground = ground;
		this.gamePanel = gamePanel;
	}
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch (keyCode) {
		case KeyEvent.VK_UP:
			snake.changeDirection(Snake.UP);
			break;
		case KeyEvent.VK_DOWN:
			snake.changeDirection(Snake.DOWN);
			break;
		case KeyEvent.VK_LEFT:
			snake.changeDirection(Snake.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			snake.changeDirection(Snake.RIGHT);
			break;
		}
	}
	public void snakeMoved(Snake snake) {
		System.out.println("�ж����Ƿ���������,�Ƿ�����ʳ��,�ϰ���");
		if(food.isEatBySnake(snake)){
			snake.eatFood(food);
			//ʳ�ﱻ�Ե�,��Ӧ�����µ�ʳ�����
			food.addFood(ground.getPoint());
		}
		if(ground.isEatBySnake(snake)){
			snake.setLife(false);
			JOptionPane.showConfirmDialog(null, "GameOver");
			System.exit(0);
		}
		if(snake.isEatSelf()){
			snake.setLife(false);
			JOptionPane.showConfirmDialog(null, "GameOver");
			System.exit(0);
		}
		//��ʾ ����,ʳ��,�ϰ���
		gamePanel.display(snake, food, ground);
		
	}
	/**
	 * ��Ϸ��ʼ
	 */
	public void startGame(){
		snake.start();
		food.addFood(ground.getPoint());
	}
	
}
