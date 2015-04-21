package org.wyzc.elt.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.wyzc.elt.control.ClientContext;
import org.wyzc.elt.exception.IdPassException;

/**
 * ��½����
 * @author Administrator
 *
 */
public class LoginFrame extends JFrame{
	JTextField idField;
	JPasswordField passField;
	public static void main(String[] args) {
		new LoginFrame().setVisible(true);
	}
	private ClientContext clientContext;
	public void setClientContext(ClientContext clientContext) {
		this.clientContext = clientContext;
		this.clientContext.setLoginFrame(this);
	}
	public LoginFrame(){
		this.setTitle("��Ӯ���߲���ϵͳ");
		this.setSize(280, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				clientContext.exit();
			}
		});
		//���ô�������ݴ���
		this.setContentPane(createContentPanel());
	}
	private JPanel createContentPanel(){
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(BorderLayout.NORTH,createNPanel());
		panel.add(BorderLayout.CENTER,createCenterPanel());
		panel.add(BorderLayout.SOUTH,createSPanel());
		return panel;
	}
	private JPanel createNPanel(){
		JPanel panel = new JPanel();
		panel.add(new JLabel("��½ϵͳ"),JLabel.CENTER);
		return panel;
	}
	private JPanel createCenterPanel(){
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(BorderLayout.NORTH,createIdPassPanel());
		return panel;
	}
	private JPanel createIdPassPanel(){
		JPanel panel = new JPanel(new GridLayout(2,1));
		panel.add(createIdPanel());
		panel.add(createPassPanel());
		return panel;
	}
	private JPanel createIdPanel(){
		JPanel panel = new JPanel(new BorderLayout());
		JLabel lable = new JLabel("���:");
		idField = new JTextField(10);
		panel.add(BorderLayout.WEST,lable);
		panel.add(BorderLayout.CENTER,idField);
		return panel;
	}
	private JPanel createPassPanel(){
		JPanel panel = new JPanel(new BorderLayout());
		JLabel lable = new JLabel("����:");
		passField = new JPasswordField(10);
		panel.add(BorderLayout.WEST,lable);
		panel.add(BorderLayout.CENTER,passField);
		return panel;
	}
	private JPanel createSPanel(){
		JPanel panel = new JPanel();
		JButton loginBtn = new JButton("��½");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					clientContext.logon();
				} catch (IdPassException e1) {
					JOptionPane.showMessageDialog(LoginFrame.this, e1.getMessage());
				}
			}
		});
		JButton cancelBtn = new JButton("ȡ��");
		panel.add(loginBtn);
		panel.add(cancelBtn);
		cancelBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				clientContext.exit();
			}
		});
		return panel;
	}
	/**
	 * ��ȡid����
	 */
	public String getId(){
		return idField.getText().trim();
	}
	/**
	 * ��ȡ��������
	 */
	public String getPassword(){
		return new String(passField.getPassword());
	}
}
