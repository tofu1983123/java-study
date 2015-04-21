package org.wyzc.elt.control;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import org.wyzc.elt.entity.ExamInfo;
import org.wyzc.elt.entity.QuestionInfo;
import org.wyzc.elt.entity.User;
import org.wyzc.elt.exception.IdPassException;
import org.wyzc.elt.service.ExamService;
import org.wyzc.elt.util.ReadUtil;
import org.wyzc.elt.view.ExamFrame;
import org.wyzc.elt.view.LoginFrame;
import org.wyzc.elt.view.MenuFrame;

public class ClientContext {
	private LoginFrame loginFrame;
	private MenuFrame menuFrame;
	private ExamFrame examFrame;
	private ExamService examService;
	private QuestionInfo currentQuestionInfo;
	private ExamInfo examInfo;
	private User user;//��ǰ��½�û�
	private int totalScore;
	private boolean isOver;
	private Timer timer = null;
	public void setExamService(ExamService examService) {
		this.examService = examService;
	}
	public void setLoginFrame(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
	}
	public void setMenuFrame(MenuFrame menuFrame) {
		this.menuFrame = menuFrame;
	}
	public void setExamFrame(ExamFrame examFrame) {
		this.examFrame = examFrame;
	}
	public void exit(){
		if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "ȷ��Ҫ�˳���?")){
			System.exit(0);
		}
	}
	public void logon() throws IdPassException{
		String id = loginFrame.getId();
		if(id == null || "".equals(id))
			throw new IdPassException("��Ų���Ϊ��!");
		String pass = loginFrame.getPassword();
		if(pass == null || "".equals(pass))
			throw new IdPassException("���벻��Ϊ��!");
		user = examService.logon(id, pass);
		loginFrame.setVisible(false);
		menuFrame.updateMenuFrame();
		menuFrame.setVisible(true);
	}
	public User getUser() {
		return user;
	}
	//��ʼ���Եķ���
	public void start(){
		if(isOver){
			JOptionPane.showMessageDialog(menuFrame, "���Ѿ��μ��꿼��!");
			return;
		}
		//��ʾ���Ե�ҳ��
		//1.׼��ҳ���ϱ�ǩ������
		examInfo = examService.start();
		examInfo.setUser(user);
		//2.׼����Ŀ����
		this.currentQuestionInfo = examService.getQuestionInfo(0);
		examFrame.updateView(examInfo,currentQuestionInfo);
		menuFrame.setVisible(false);
		examFrame.setVisible(true);
		startTime();
	}
	public void startTime(){
		//���Խ���ʱ��
		final long end = System.currentTimeMillis() + examInfo.getTimeLimit() * 60 * 1000;
		timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				long sub = end - System.currentTimeMillis();
				if(sub <= 0){
					over();
					return;
				}
				examFrame.updateTimer(sub);
			}
		},0,1000);
	}
	public void next(){
		int index = this.currentQuestionInfo.getPageIndex();
		//�����û�ѡ��Ĵ�
		ArrayList<Integer> userAnswers = examFrame.getUserAnswers();
		//this.currentQuestionInfo.setUserAnswer(userAnswers);
		examService.saveUserAnswers(index, userAnswers);
		//��ȡ�µ�ҳ��
		int pageIndex = index + 1;
		QuestionInfo questionInfo = this.examService.getQuestionInfo(pageIndex);
		examFrame.updateView(examInfo,questionInfo);
		this.currentQuestionInfo = questionInfo;
	}
	public void pre(){
		int index = this.currentQuestionInfo.getPageIndex();
		//�����û�ѡ��Ĵ�
		ArrayList<Integer> userAnswers = examFrame.getUserAnswers();
		//this.currentQuestionInfo.setUserAnswer(userAnswers);
		examService.saveUserAnswers(index, userAnswers);
		
		int pageIndex = index - 1;
		QuestionInfo questionInfo = this.examService.getQuestionInfo(pageIndex);
		examFrame.updateView(examInfo,questionInfo);
		this.currentQuestionInfo = questionInfo;
	}
	public void send(){
		if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(examFrame, "��ȷ��Ҫ������?")){
			over();
		}else
			return;
	}
	private void over(){
		//�ѵ㽻��ťʱ���ڵ�ҳ��,��ǰ����Ĵ𰸱�������
		ArrayList<Integer> userAnswers = this.examFrame.getUserAnswers();
		//this.currentQuestionInfo.setUserAnswer(userAnswers);
		examService.saveUserAnswers(this.currentQuestionInfo.getPageIndex(), userAnswers);
		
		isOver = true;
		timer.cancel();
		totalScore = this.examService.getTotalScore();
		JOptionPane.showMessageDialog(examFrame, "�����Եĳɼ���:" + totalScore + "��");
		examFrame.setVisible(false);
		menuFrame.setVisible(true);
	}
	public void getResult(){
		if(isOver)
			JOptionPane.showMessageDialog(menuFrame, "�����Եĳɼ���:" + totalScore + "��");
		else
			JOptionPane.showMessageDialog(menuFrame, "�����Ȳμӿ���!");
	}
}
