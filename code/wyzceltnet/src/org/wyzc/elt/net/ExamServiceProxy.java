package org.wyzc.elt.net;

import java.util.ArrayList;

import org.wyzc.elt.entity.ExamInfo;
import org.wyzc.elt.entity.QuestionInfo;
import org.wyzc.elt.entity.Request;
import org.wyzc.elt.entity.Response;
import org.wyzc.elt.entity.User;
import org.wyzc.elt.exception.IdPassException;
import org.wyzc.elt.service.ExamService;

public class ExamServiceProxy implements ExamService {
	private String sessionId;
	public User logon(String id, String pass) throws IdPassException {
		// 发送请求,提取响应
		Request request = new Request(new Object[] { id, pass }, new Class[] {
				String.class, String.class }, "logon");
		Response response = SocketUtil.remoteAll(request);
		if(!response.isSuccess())
			throw new IdPassException(response.getException().getMessage());
		Object obj = response.getObj();
		this.sessionId = response.getSessionId();
		return (User)obj;
	}

	public ExamInfo start() {
		// 发送请求,提取响应
		Request request = new Request(new Object[]{},new Class[]{},"start");
		request.setSessionId(sessionId);
		Response response = SocketUtil.remoteAll(request);
		if(!response.isSuccess())
			throw new RuntimeException(response.getException().getMessage());
		ExamInfo examInfo = (ExamInfo)response.getObj();
		return examInfo;
	}

	public ArrayList<QuestionInfo> getExamQuestions() {
		Request request = new Request(new Object[]{},new Class[]{},"getExamQuestions");
		request.setSessionId(sessionId);
		Response response = SocketUtil.remoteAll(request);
		if(!response.isSuccess())
			throw new RuntimeException(response.getException().getMessage());
		ArrayList<QuestionInfo> examQuestions = (ArrayList<QuestionInfo>)response.getObj();
		return examQuestions;
	}

	public QuestionInfo getQuestionInfo(int pageIndex) {
		Request request = new Request(new Object[]{pageIndex},new Class[]{int.class},"getQuestionInfo");
		request.setSessionId(sessionId);
		Response response = SocketUtil.remoteAll(request);
		if(!response.isSuccess())
			throw new RuntimeException(response.getException().getMessage());
		QuestionInfo questionInfo = (QuestionInfo)response.getObj();
		return questionInfo;
	}

	public int getTotalScore() {
		Request request = new Request(new Object[]{},new Class[]{},"getTotalScore");
		request.setSessionId(sessionId);
		Response response = SocketUtil.remoteAll(request);
		if(!response.isSuccess())
			throw new RuntimeException(response.getException().getMessage());
		Integer result = (Integer)response.getObj();
		return result.intValue();
	}

	public void saveUserAnswers(int pageIndex, ArrayList<Integer> userAnswers) {
		Request request = new Request(new Object[]{pageIndex,userAnswers},new Class[]{int.class,userAnswers.getClass()},"saveUserAnswers");
		request.setSessionId(sessionId);
		Response response = SocketUtil.remoteAll(request);
		if(!response.isSuccess())
			throw new RuntimeException(response.getException().getMessage());
	}

}
