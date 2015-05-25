package lesson3.xml;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;


public class UserToXml {
	public static void main(String[] args) {
		builderUserToXml();
	}
	public static void builderUserToXml(){
		EntityContext entityContext = new EntityContext();
		HashMap<String, User> users = entityContext.getUsers();
		Document doc = DocumentHelper.createDocument();
		Element rootElement = doc.addElement("allusers");
		for(String key:users.keySet()){
			User u = users.get(key);
			Element element = rootElement.addElement("user");
			Element idElement = element.addElement("id");
			idElement.setText(u.getId());
			Element nameElement = element.addElement("name");
			nameElement.setText(u.getName());
			Element passElement = element.addElement("pass");
			passElement.setText(u.getPass());
			Element emailElement = element.addElement("email");
			emailElement.setText(u.getEmail());
		}
		printToXml("d:\\users.xml",doc);
	}
	private static void printToXml(String filename,Document doc){
		try {
			FileWriter fw = new FileWriter(filename);
			OutputFormat outputFormat = OutputFormat.createPrettyPrint();
			XMLWriter writer = new XMLWriter(fw,outputFormat);
			writer.write(doc);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
