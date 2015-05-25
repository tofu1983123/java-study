package lesson3.xml;

import java.util.ArrayList;
import java.util.HashMap;


public class EntityContextTest {

	public static void main(String[] args) {
		EntityContext entityContext = new EntityContext();
		/*HashMap<String, User> users = entityContext.getUsers();
		for (String id : users.keySet()) {
			User user = users.get(id);
			System.out.println(user);
		}*/
		HashMap<Integer, ArrayList<Question>> questions = entityContext.getQuestions();
		for(Integer key:questions.keySet()){
			System.out.println(key);
			ArrayList<Question> levelQuestions = questions.get(key);
			for(Question question:levelQuestions){
//				System.out.println(question.getTitle());
//				for(String option:question.getOptions()){
//					System.out.println(option);
//				}
				System.out.println(question);
			}
			System.out.println("========================");
		}
	}

}
