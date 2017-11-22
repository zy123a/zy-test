package com.zy.xmlparsing;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMParsingOfXml {
    public static void main(String[] args) throws Exception {
//        静态创建DOM文件构建工厂
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
//        创建Dom文件构造器
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        File file = new File("/Users/zhengyin/workspace/zy-test/src/main/resources/xmlParsing.xml");
//        解析文件得到dom类
        Document document = documentBuilder.parse(file);
//        依据标签名获得该名称的所有节点
        NodeList bookList = document.getElementsByTagName("book");
        for(int i = 0; i < bookList.getLength(); i++) {
            Node book = bookList.item(i);
//            获得该节点的所有子节点
            NodeList nameList = book.getChildNodes();
//            遍历所有节点
            for(int j = 0; j < nameList.getLength(); j++) {
                Node name = nameList.item(j);
//                方法二：判读子节点为元素节点，并且节点名称为name，则输出其第一个子节点内容
                if (name.getNodeType() == Node.ELEMENT_NODE && name.getNodeName().equals("name")) {
                    System.out.println(name.getFirstChild().getNodeValue());
                }
//                方法二：判读改节点是否还有子节点，没有表示页子节点，则输出节点内容；
                if (name.hasChildNodes()) {
                    System.out.println(name.getFirstChild().getNodeValue());
                }
            }
        }
    }
}
