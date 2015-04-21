package org.wyzc.elt.entity;

public class ExamInfo {
	private User user;//考试的用户信息
	private int timeLimit;//时间限制
	private String title;//考试科目
	private int totalNumbers;//考试题目数量
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
		return "姓名:" + user.getName() + " 编号:"
				+ user.getId() + " 考试时间:"
				+ timeLimit + "分钟" + " 科目:"
				+ title + " 题量:"
				+ totalNumbers;
	}
}
