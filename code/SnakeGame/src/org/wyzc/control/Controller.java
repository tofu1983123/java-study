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
	 * 控制器类
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
		System.out.println("判断蛇是否碰到身体,是否碰到食物,障碍物");
		if(food.isEatBySnake(snake)){
			snake.eatFood(food);
			//食物被吃掉,就应该有新的食物产生
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
		//显示 身体,食物,障碍物
		gamePanel.display(snake, food, ground);
		
	}
	/**
	 * 游戏开始
	 */
	public void startGame(){
		snake.start();
		food.addFood(ground.getPoint());
	}
	
}
