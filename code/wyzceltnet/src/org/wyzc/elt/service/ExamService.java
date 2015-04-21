package org.wyzc.elt.service;

import java.util.ArrayList;

import org.wyzc.elt.entity.ExamInfo;
import org.wyzc.elt.entity.Question;
import org.wyzc.elt.entity.QuestionInfo;
import org.wyzc.elt.entity.User;
import org.wyzc.elt.exception.IdPassException;

public interface ExamService {
	User logon(String id,String pass) throws IdPassException;
	ExamInfo start();
	ArrayList<QuestionInfo> getExamQuestions();
	//��ȡҳ���ϵĿ�����Ϣ
	QuestionInfo getQuestionInfo(int pageIndex);
	int getTotalScore();
	public void saveUserAnswers(int pageIndex,ArrayList<Integer> userAnswers);
}
