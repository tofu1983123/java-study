package corelesson7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Demo6 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("�ҵĴ���");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel3 panel = new MyPanel3();
		frame.add(panel);
		frame.setVisible(true);
	}
}
class MyPanel3 extends JPanel{
	private int x,y;
	public MyPanel3(){
		this.addMouseMotionListener(new MouseMotionAdapter(){
			@Override
			public void mouseMoved(MouseEvent e) {
				//������ƶ��ĵ�Ϊ���Ͻ����껭����.
				x = e.getX();
				y = e.getY();
				repaint();//���Զ�����paintComponent����
			}
		});
	}
	@Override
	protected void paintComponent(Graphics g) {
//		g.drawLine(10, 10, 100, 100);//ֱ��������յ����
//		g.drawRect(10,10,100,100);//���������Ͻ������ȸ߶Ⱦ���
//		g.drawString("helloworld", 100, 100);
		//Ҳ����ֱ�ӻ�ͼ�ζ���
		/*Line2D line = new Line2D.Double(10, 10, 100, 100);
		Rectangle2D rect = new Rectangle2D.Double(10, 10, 100, 100);
		//ת������
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(line);
		g2.draw(rect);*/
		
		//g.draw3DRect(10, 10, 100, 100, true);
		super.paintComponent(g);//������
		g.drawRect(x,y,100,100);
	}
}