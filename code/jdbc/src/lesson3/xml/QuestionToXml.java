package lesson3.xml;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class QuestionToXml {

	public static void main(String[] args) {
		buildQuestionToXml();
	}

	private static void buildQuestionToXml() {
		EntityContext entityContext = new EntityContext();
		HashMap<Integer, ArrayList<Question>> questions = entityContext.getQuestions();
		Document doc = DocumentHelper.createDocument();
		Element rootElement = doc.addElement("allquestions");
		int count = 0;
		for(Integer key:questions.keySet()){
			ArrayList<Question> levelQuestions = questions.get(key);
			for(Question question:levelQuestions){
				Element questionElement = rootElement.addElement("question");
				questionElement.addAttribute("id", ++count+"");
				Element titleElement = questionElement.addElement("title");
				titleElement.setText(question.getTitle());
				Element optionsElement = questionElement.addElement("options");
				ArrayList<String> options = question.getOptions();
				for(String string:options){
					Element optionElement = optionsElement.addElement("option");
					optionElement.setText(string);
				}
				Element answersElement = questionElement.addElement("answers");
				ArrayList<Integer> answers = question.getAnswers();
				for(Integer integer:answers){
					Element anElement = answersElement.addElement("answer");
					anElement.setText(integer.toString());
				}
				Element scoreElement = questionElement.addElement("score");
				scoreElement.setText(question.getScore()+"");
				
				Element levelElement = questionElement.addElement("level");
				levelElement.setText(question.getLevel()+"");
			}
		}
		printToXml("d:\\questions.xml",doc);
	}
	private static void printToXml(String filename, Document doc) {
		try {
			//FileWriter fw = new FileWriter(filename);
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filename),"utf-8");
			OutputFormat outputFormat = OutputFormat.createPrettyPrint();
			XMLWriter writer = new XMLWriter(osw,outputFormat);
			writer.write(doc);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
