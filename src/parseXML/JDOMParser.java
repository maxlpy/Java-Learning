package parseXML;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class JDOMParser {
   public static void main(String[] args) {
      try {
         File inputFile = new File("output.xml");

         SAXBuilder saxBuilder = new SAXBuilder();
         Document document = saxBuilder.build(inputFile);
         
         Element classElement = document.getRootElement();
         System.out.println(document.getDocument());
         System.out.println(classElement.getAttributes());
         System.out.println(classElement.getAttributes());
         
         List<Element> itemList = classElement.getChildren();
         System.out.println("----------------------------");

         for (int temp = 0; temp < itemList.size(); temp++) {    
            Element item = itemList.get(temp);
            System.out.println(item.getName());
            List<Element> childList = item.getChildren();
            if (childList.size() > 0) {
            	for (int i = 0; i < childList.size(); i++) {
                	System.out.println(childList.get(i).getName());
            	}
            }
         }
      }catch(JDOMException e){
         e.printStackTrace();
      }catch(IOException ioe){
         ioe.printStackTrace();
      }
   }
}

