package corelesson7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("我的窗体");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel1 panel = new MyPanel1();
		frame.add(panel);
		frame.setVisible(true);
	}
}
class MyPanel1 extends JPanel{
	public MyPanel1(){
		addButton("蓝色",Color.blue);
		addButton("黄色",Color.yellow);
		addButton("红色",Color.red);
		/*this.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e) {
				
			}
			public void mousePressed(MouseEvent e) {
				System.out.println("鼠标按下了");
			}
			public void mouseReleased(MouseEvent e) {
				System.out.println("鼠标释放了");
			}
			public void mouseEntered(MouseEvent e) {
				System.out.println("鼠标移入了");
			}
			public void mouseExited(MouseEvent e) {
				System.out.println("鼠标移出了");
			}
		});*/
		this.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("点击鼠标了");
				System.out.println(e.getX()+":"+e.getY());
			}
		});
		/*this.addMouseMotionListener(new MouseMotionListener(){
			public void mouseDragged(MouseEvent e) {
				System.out.println("鼠标拖拽了");
			}
			public void mouseMoved(MouseEvent e) {
				System.out.println("鼠标移动了");
			}
		});*/
		this.addMouseMotionListener(new MouseMotionAdapter(){
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println(e.getX() + ":" + e.getY());
			}
		});
	}
	private void addButton(String name,final Color c){
		JButton button = new JButton(name);
		this.add(button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				MyPanel1.this.setBackground(c);
			}
		});
	}
}