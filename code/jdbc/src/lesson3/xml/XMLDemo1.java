package lesson3.xml;

import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class XMLDemo1 {

	public static void main(String[] args) {
		Document doc = DocumentHelper.createDocument();
		Element rootElement = doc.addElement("allusers");
		Element idElement = rootElement.addElement("id");
		Element nameElement = rootElement.addElement("name");
		Element passwdElement = rootElement.addElement("passwd");
		Element phoneElement = rootElement.addElement("phone");
		phoneElement.addAttribute("type", "home");
		Element emailElement = rootElement.addElement("email");
		idElement.setText("10001");
		nameElement.setText("zhangsan");
		passwdElement.setText("123456");
		phoneElement.setText("13811111111");
		emailElement.setText("xxx@163.com");
		
		try {
			FileWriter fw = new FileWriter("d:\\users.xml");
			OutputFormat outFormat = OutputFormat.createPrettyPrint();
			XMLWriter xw = new XMLWriter(fw,outFormat);
			xw.write(doc);
			xw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
