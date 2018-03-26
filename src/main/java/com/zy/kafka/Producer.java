package com.zy.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;

import java.util.Properties;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2018/2/3
 * Time:19:53
 */
public class Producer extends Thread {
    private KafkaProducer<Integer, String> producer;
    private String topic;
    private Boolean isAsyn;

    public Producer(String topic, Boolean isAsyn) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:2181");
        properties.put("client.id", "DemoProducer");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.IntegerSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        producer = new KafkaProducer<Integer, String>(properties);
        this.topic = topic;
        this.isAsyn = isAsyn;
    }




}
