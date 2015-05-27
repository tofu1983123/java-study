package org.wyzc.test;

import javax.swing.JFrame;

import org.wyzc.control.Controller;
import org.wyzc.entity.Food;
import org.wyzc.entity.Ground;
import org.wyzc.entity.Snake;
import org.wyzc.util.Global;
import org.wyzc.view.GamePanel;

public class SnakeGameTest {

	public static void main(String[] args) {
		//实体对象的创建
		Snake snake = new Snake();
		Food food = new Food();
		Ground ground = new Ground();
		//视图对象的创建
		GamePanel gamePanel = new GamePanel();
		//控制器的创建---->既是蛇的监听器,也是键盘的监听器.
		Controller c = new Controller(snake,food,ground,gamePanel);
		
		snake.addSnakeListener(c);
		gamePanel.addKeyListener(c);
		
		JFrame frame = new JFrame("贪吃蛇version1.0");
		frame.setSize(Global.CELL_SIZE*Global.WIDTH+100, Global.CELL_SIZE*Global.HEIGHT+100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		//让面板获得焦点.
		gamePanel.setFocusable(true);
		frame.add(gamePanel);
		
		//启动游戏
		c.startGame();
		//显示
		frame.setVisible(true);
	}

}
