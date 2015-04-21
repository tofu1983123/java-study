package org.wyzc.elt.entity;

import java.util.ArrayList;

public class QuestionInfo {
	private Question question;//当前页的考试题目
	private int pageIndex;//当前页
	private ArrayList<Integer> userAnswer = new ArrayList<Integer>();//用户选择的答案
	public QuestionInfo(){}
	public QuestionInfo(Question question, int pageIndex) {
		super();
		this.question = question;
		this.pageIndex = pageIndex;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public ArrayList<Integer> getUserAnswer() {
		return userAnswer;
	}
	public void setUserAnswer(ArrayList<Integer> userAnswer) {
		this.userAnswer = userAnswer;
	}
	@Override
	public String toString() {
		return question.toString();
	}
	
}
