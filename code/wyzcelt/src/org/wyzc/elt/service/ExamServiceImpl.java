package org.wyzc.elt.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.wyzc.elt.dao.EntityContext;
import org.wyzc.elt.entity.ExamInfo;
import org.wyzc.elt.entity.Question;
import org.wyzc.elt.entity.QuestionInfo;
import org.wyzc.elt.entity.User;
import org.wyzc.elt.exception.IdPassException;
import org.wyzc.elt.util.ReadUtil;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ExamServiceImpl implements ExamService{
	private EntityContext entityContext;
	private ArrayList<QuestionInfo> examQuestions;//考试的题目信息
	public void setEntityContext(EntityContext entityContext) {
		this.entityContext = entityContext;
	}
	public User logon(String id, String pass) throws IdPassException {
		HashMap<String, User> users = entityContext.getUsers();
		/*if(!users.containsKey(id))
			throw new IdPassException("用户不存在!");
		if(users.get(id).getPass().equals(pass))
			throw new IdPassException("密码错误!");
		User user = users.get(id);
		return user;*/
		User user = users.get(id);
		if(user == null){
			throw new IdPassException("用户不存在!");
		}
		if(!user.getPass().equals(pass)){
			throw new IdPassException("密码不正确!");
		}
		return user;
	}
	public ExamInfo start() {
		//获取考试题目
		getExamQuestions();
		ExamInfo examInfo = new ExamInfo();
		examInfo.setTitle(ReadUtil.getMessage("examtitle"));
		examInfo.setTimeLimit(Integer.parseInt(ReadUtil.getMessage("timerLimit")));
		examInfo.setTotalNumbers(this.examQuestions.size());
		
		return examInfo;
	}
	public ArrayList<QuestionInfo> getExamQuestions() {
		int index = 0;
		Random random = new Random();
		//一次考试所有的试题
		examQuestions = new ArrayList<QuestionInfo>();
		//先获得题库信息
		HashMap<Integer, ArrayList<Question>> questions = entityContext.getQuestions();
		for(int key = 1;key <= 10;key++){
			//这个等级所有的题目
			ArrayList<Question> levelQuestions = questions.get(key);
			Question question1 = levelQuestions.remove(random.nextInt(levelQuestions.size()));
			examQuestions.add(new QuestionInfo(question1,index++));
			Question question2 = levelQuestions.remove(random.nextInt(levelQuestions.size()));
			examQuestions.add(new QuestionInfo(question2,index++));
		}
		return examQuestions;
	}
	public QuestionInfo getQuestionInfo(int pageIndex) {
//		Question question = this.examQuestions.get(pageIndex);
//		QuestionInfo questioninfo = new QuestionInfo();
//		questioninfo.setQuestion(question);
//		questioninfo.setPageIndex(pageIndex);
		QuestionInfo questionInfo = this.examQuestions.get(pageIndex);
		return questionInfo;
	}
	public ArrayList<Integer> saveUserAnswer() {
		// TODO 自动生成的方法存根
		return null;
	}
	public int getTotalScore() {
		int totalScore = 0;
		for(QuestionInfo questionInfo:examQuestions){
			//获取标准答案
			ArrayList<Integer> answers = questionInfo.getQuestion().getAnswers();
			//获取用户的答案
			ArrayList<Integer> userAnswers = questionInfo.getUserAnswer();
			if(answers.equals(userAnswers)){
				totalScore += questionInfo.getQuestion().getScore();
			}
		}
		return totalScore;
	}
	
}
