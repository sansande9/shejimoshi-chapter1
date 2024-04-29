package edu.cqie.qiaojie;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMlUtil {
    public static Object getBean(String args){
        try{
            DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dfactory.newDocumentBuilder();
            Document doc ;
            doc = builder.parse("src//edu//cqie//qiaojie//config.xml");
            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            nl = doc.getElementsByTagName("className");
            if(args.equals("image")){
                classNode = nl.item(0).getFirstChild();
            } else if (args.equals("os")) {
                classNode = nl.item(1).getFirstChild();

            }
            cName = classNode.getNodeValue();
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
