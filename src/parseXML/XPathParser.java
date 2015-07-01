package parseXML;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XPathParser {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
		String inputFile = "output.xml";
		// Create a DocumentBuilder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		// Create a Document from a file or stream
		Document doc = builder.parse(inputFile);
		doc.getDocumentElement().normalize();
		
		XPath xPath = XPathFactory.newInstance().newXPath();
		String expression = "/*";	 
		
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
//        System.out.println(nodeList.getLength());
        for (int i = 0; i < nodeList.getLength(); i++) {
        	Node nNode = nodeList.item(i);
//        	System.out.println("##: " + nNode.getPrefix());
        	System.out.println(nNode.getNodeName());
        	Element e = (Element)nNode;
        	System.out.println(e.getChildNodes().getLength());
        	NodeList nList = e.getChildNodes();
        	for (int j = 0; j < e.getChildNodes().getLength(); j++) {
        		String str = nList.item(j).getNodeName();
        		Node node = nList.item(j);
        		Element s = (Element)node;
        		
        		System.out.println(s.getChildNodes().getLength());
        		if (!str.contains("#text")) {
        			System.out.println(nList.item(j).getNodeName());
        		}
        		System.out.println(nList.item(j).getTextContent());
        	}
        }
	}
}
