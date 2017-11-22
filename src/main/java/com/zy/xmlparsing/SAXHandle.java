package com.zy.xmlparsing;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
public class SAXHandle extends DefaultHandler{

    public String preNode;
    /**
     * 解析文档开始调用方法
     * @throws SAXException
     */
    @Override
    public void startDocument() throws SAXException {
        System.out.println("-------startDocument------");
    }
    /**
     * 解析文档结束调用方法
     */
    @Override
    public void endDocument() throws SAXException {
        System.out.println("-------endDocument------");
    }
    /**
     * 解析元素开始调用方法
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        preNode=qName;
    }
    /**
     * 解析元素结束调用方法
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        preNode=null;
    }
    /**
     *解析文本元素调用方法
     */
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (preNode != null && preNode.equals("name")) {
            System.out.println(new String(ch,start,length));
        }
    }
}
