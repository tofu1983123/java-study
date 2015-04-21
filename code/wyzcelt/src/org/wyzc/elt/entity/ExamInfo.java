package org.wyzc.elt.entity;

public class ExamInfo {
	private User user;//���Ե��û���Ϣ
	private int timeLimit;//ʱ������
	private String title;//���Կ�Ŀ
	private int totalNumbers;//������Ŀ����
	public ExamInfo(){}
	public ExamInfo(User user, int timeLimit, String title, int totalNumbers) {
		super();
		this.user = user;
		this.timeLimit = timeLimit;
		this.title = title;
		this.totalNumbers = totalNumbers;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTotalNumbers() {
		return totalNumbers;
	}
	public void setTotalNumbers(int totalNumbers) {
		this.totalNumbers = totalNumbers;
	}
	@Override
	public String toString() {
		return "����:" + user.getName() + " ���:"
				+ user.getId() + " ����ʱ��:"
				+ timeLimit + "����" + " ��Ŀ:"
				+ title + " ����:"
				+ totalNumbers;
	}
}
