package org.wyzc.elt.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.wyzc.elt.entity.Question;
import org.wyzc.elt.entity.User;
import org.wyzc.elt.util.IOUtil;
import org.wyzc.elt.util.ReadUtil;

public class EntityContext {
	//���ڴ���û���Ϣ
	private HashMap<String, User> users = new HashMap<String, User>();
	/*
	 *������ļ���---->���е���Ŀ�Եȼ�Ϊkey,ArrayListΪvalue
	 *ArrayList�д�ŵ���ͬһ���ȼ�����Ŀ
	 * */
	private HashMap<Integer, ArrayList<Question>> questions = new HashMap<Integer, ArrayList<Question>>();
	public EntityContext(){
		try {
			loadUser();
			loadQuestion();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void loadUser() throws IOException{
		BufferedReader br = IOUtil.getReader(ReadUtil.getMessage("userpath"));
		String str = null;
		while((str = br.readLine()) != null){
			if(str.startsWith("#"))continue;
			String[] usermessage = str.split(":");
			User user = new User(usermessage[0],usermessage[1],usermessage[2],usermessage[3]);
			users.put(user.getId(), user);
		}
		IOUtil.close();
	}
	
	private void loadQuestion() throws IOException{
		BufferedReader br = IOUtil.getReader(ReadUtil.getMessage("questionpath"));
		String row = null;
		while((row = br.readLine())!= null){
			Question question = parseQuestion(br, row);
			putQuestion(question);
		}
	}
	/**
	 * ������е��ⰴ�ȼ���Ϊkey  ��Ŀ�ļ�����Ϊvalue����map��
	 * @param question
	 */
	private void putQuestion(Question question){
		int level = question.getLevel();
		if(questions.containsKey(level)){
			questions.get(level).add(question);
		}else{
			ArrayList<Question> levelQuestions = new ArrayList<Question>();
			levelQuestions.add(question);
			questions.put(level, levelQuestions);
		}
	}
	/**
	 * ����һ����Ŀ����װ��һ������
	 * @param br
	 * @param row
	 * @return
	 * @throws IOException
	 */
	private Question parseQuestion(BufferedReader br, String row)
			throws IOException {
		Question question = new Question();
		String regex = "[@,][a-z]+=";
		String[] ss = row.split(regex);
		question.setScore(Integer.parseInt(ss[2]));
		question.setLevel(Integer.parseInt(ss[3]));
		question.setAnswers(getAnswers(ss[1]));
		String title = br.readLine();
		question.setTitle(title);
		question.setOptions(getOptions(br));
		return question;
	}
	/**
	 * ������Ŀ��ѡ��
	 * @param br
	 * @return
	 * @throws IOException
	 */
	private ArrayList<String> getOptions(BufferedReader br) throws IOException{
		ArrayList<String> options = new ArrayList<String>();
		options.add(br.readLine());
		options.add(br.readLine());
		options.add(br.readLine());
		options.add(br.readLine());
		return options;
	}
	/**
	 * ������Ŀ�Ĵ�
	 * @param ans
	 * @return
	 */
	private ArrayList<Integer> getAnswers(String ans){
		String[] answers = ans.split("/");
		ArrayList<Integer> as = new ArrayList<Integer>();
		for (String answer : answers) {
			as.add(Integer.parseInt(answer));
		}
		return as;
	}
	/**
	 * �����û�
	 * @return
	 */
	public HashMap<String, User> getUsers() {
		return users;
	}
	/**
	 * �������
	 * @return
	 */
	public HashMap<Integer, ArrayList<Question>> getQuestions() {
		return questions;
	}
}
