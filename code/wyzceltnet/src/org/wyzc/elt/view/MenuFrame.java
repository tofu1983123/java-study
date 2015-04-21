package org.wyzc.elt.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.wyzc.elt.control.ClientContext;

public class MenuFrame extends JFrame{
	private JLabel userLabel;
	public static void main(String[] args) {
		new MenuFrame().setVisible(true);
	}
	private ClientContext clientContext;
	public void setClientContext(ClientContext clientContext) {
		this.clientContext = clientContext;
		this.clientContext.setMenuFrame(this);
	}
	public MenuFrame(){
		this.setTitle("��Ӯ���߲���ϵͳ");
		this.setSize(600, 380);
		this.setLocationRelativeTo(this);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				clientContext.exit();
			}
		});
		this.setContentPane(createContentPanel());
	}
	private JPanel createContentPanel(){
		JPanel panel = new JPanel(new BorderLayout());
		//��ȡ��ǰ�����ڰ��µ�·����Ϊurl
		URL url = this.getClass().getResource("title.png");
		//����ͼƬ����
		ImageIcon icon = new ImageIcon(url);
		JLabel label = new JLabel(icon);
		panel.add(BorderLayout.NORTH,label);
		panel.add(createCenterPanel());
		panel.add(BorderLayout.SOUTH,new JLabel("��Ӯ�Ƽ�.��Ȩ����!����ؾ�!",JLabel.RIGHT));
		return panel;
	}
	private JPanel createCenterPanel(){
		JPanel panel = new JPanel(new BorderLayout());
		userLabel = new JLabel("��ӭXXX��������ϵͳ",JLabel.CENTER);
		panel.add(BorderLayout.NORTH,userLabel);
		panel.add(BorderLayout.CENTER,createBtnPanel());
		return panel;
	}
	private JPanel createBtnPanel(){
		JPanel panel = new JPanel();
		JButton startButton = createBtn("��ʼ","exam.png");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientContext.start();
			}
		});
		panel.add(startButton);
		JButton resultButton = createBtn("����","result.png");
		resultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientContext.getResult();
			}
		});
		panel.add(resultButton);
		panel.add(createBtn("����","message.png"));
		JButton exitButton = createBtn("�뿪","exit.png");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientContext.exit();
			}
		});
		panel.add(exitButton);
		return panel;
	}
	private JButton createBtn(String name,String imageName){
		URL url = this.getClass().getResource(imageName);
		JButton button = new JButton(name,new ImageIcon(url));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setVerticalTextPosition(SwingConstants.BOTTOM);
		return button;
	}
	public void updateMenuFrame(){
		userLabel.setText("��ӭ"+clientContext.getUser().getName()+"��������ϵͳ");
		//������ɫ
		userLabel.setForeground(Color.red);
	}
}
