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
		//ʵ�����Ĵ���
		Snake snake = new Snake();
		Food food = new Food();
		Ground ground = new Ground();
		//��ͼ����Ĵ���
		GamePanel gamePanel = new GamePanel();
		//�������Ĵ���---->�����ߵļ�����,Ҳ�Ǽ��̵ļ�����.
		Controller c = new Controller(snake,food,ground,gamePanel);
		
		snake.addSnakeListener(c);
		gamePanel.addKeyListener(c);
		
		JFrame frame = new JFrame("̰����version1.0");
		frame.setSize(Global.CELL_SIZE*Global.WIDTH+100, Global.CELL_SIZE*Global.HEIGHT+100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		//������ý���.
		gamePanel.setFocusable(true);
		frame.add(gamePanel);
		
		//������Ϸ
		c.startGame();
		//��ʾ
		frame.setVisible(true);
	}

}
