package com.zy.xmlparsing;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
public class SAXParsingOfXml {

    public static void main(String[] args) throws Exception {
//        创建SAX解析工厂
        SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
//        创建SAX解析
        SAXParser saxParser=saxParserFactory.newSAXParser();
        File file = new File("/Users/zhengyin/workspace/zy-test/src/main/resources/xmlParsing.xml");
//        解析文档
        saxParser.parse(file,new SAXHandle());
    }
}
