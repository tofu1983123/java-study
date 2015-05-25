package lesson3.xml;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlDemo2 {

	public static void main(String[] args) {
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(new File("d:\\users.xml"));
			//获取根节点
			Element rootElement = doc.getRootElement();
			System.out.println(rootElement.elementText("id"));
			System.out.println(rootElement.elementText("name"));
			System.out.println(rootElement.elementText("passwd"));
			System.out.println("========================");
			//获取得到迭代器
			Iterator<Element> elements = rootElement.elementIterator();
			while(elements.hasNext()){
				Element element = elements.next();
				
				Attribute attr = element.attribute("type");
				if(attr!=null){
					System.out.println(attr.getName()+"="+attr.getText());
				}
				
				System.out.println(element.getName()+"="+element.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
