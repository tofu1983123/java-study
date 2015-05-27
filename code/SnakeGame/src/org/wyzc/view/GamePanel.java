package org.wyzc.view;

import java.awt.Graphics;

import javax.swing.JPanel;

import org.wyzc.entity.Food;
import org.wyzc.entity.Ground;
import org.wyzc.entity.Snake;
/**
 * 操作界面
 * @author Administrator
 *
 */
public class GamePanel extends JPanel{
	private Snake snake;
	private Food food;
	private Ground ground;
	public void display(Snake snake,Food food,Ground ground){
		System.out.println("面板正在显示...");
		this.snake = snake;
		this.food = food;
		this.ground = ground;
		repaint();
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(snake != null && food != null && ground != null){
			snake.drawMe(g);
			food.drawMe(g);
			ground.drawMe(g);
		}
	}
}
