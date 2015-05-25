package lesson3.xml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;

import lesson2.JdbcUtil;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ImportQuestionToTable {
	public static void main(String[] args) {
//		ArrayList<Question> questions = parseQuestionXml();
//		for (Question question : questions) {
//			System.out.println(question);
//		}
		toDb();
	}
	public static ArrayList<Question> parseQuestionXml(){
		SAXReader reader = new SAXReader();
		ArrayList<Question> questions = new ArrayList<Question>();
		try {
			Document doc = reader.read("d:\\questions.xml");
			Element rootElement = doc.getRootElement();
			Iterator<Element> itor = rootElement.elementIterator();
			while(itor.hasNext()){
				Question question  = new Question();
				Element questionElement = itor.next();
				Attribute attr = questionElement.attribute("id");
				question.setId(Integer.parseInt(attr.getValue()));
				question.setTitle(questionElement.elementText("title"));
				question.setScore(Integer.parseInt(questionElement.elementText("score")));
				question.setLevel(Integer.parseInt(questionElement.elementText("level")));
				
				Element optionsElement = questionElement.element("options");
				ArrayList<String> options = new ArrayList<String>();
				Iterator<Element> optionsItor = optionsElement.elementIterator();
				while(optionsItor.hasNext()){
					options.add(optionsItor.next().getText());
				}
				question.setOptions(options);
				
				Element answersElement = questionElement.element("answers");
				ArrayList<Integer> answers = new ArrayList<Integer>();
				Iterator<Element> anItor = answersElement.elementIterator();
				while(anItor.hasNext()){
					answers.add(Integer.parseInt(anItor.next().getText()));
				}
				question.setAnswers(answers);
				questions.add(question);
			}
			return questions;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void toDb(){
		ArrayList<Question> questions = parseQuestionXml();
		try {
			Connection con = JdbcUtil.getConn();
			String sql = "insert into questions(id,title,options,answer,score,levle) values(?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			int count = 0;
			for (Question question : questions) {
				count++;
				pstmt.setInt(1, question.getId());
				pstmt.setString(2, question.getTitle());
				ArrayList<String> options = question.getOptions();
				String optionsString = "";
				for (String string : options) {
					optionsString += string + "|";
				}
				pstmt.setString(3, optionsString);
				ArrayList<Integer> answers = question.getAnswers();
				String answersString = "";
				for (String string : options) {
					answersString += string + "|";
				}
				pstmt.setString(4, answersString);
				pstmt.setInt(5, question.getScore());
				pstmt.setInt(6, question.getLevel());
				pstmt.addBatch();
				if(count % 10 == 0){
					pstmt.executeBatch();
					pstmt.clearBatch();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
