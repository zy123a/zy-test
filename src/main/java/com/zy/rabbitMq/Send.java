package com.zy.rabbitMq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2016/12/30
 * Time:16:36
 */
public class Send {
    private static String queue="hello";

    public static void main(String[] args) throws Exception {
        // 创建连接到RabbitMQ
        ConnectionFactory connectionFactory=new ConnectionFactory();
        // 设置主机
        connectionFactory.setHost("localhost");
        //创建一个连接
        Connection connection=connectionFactory.newConnection();
        // 创建一个频道
        Channel channel=connection.createChannel();
        //设置队列持久化
        boolean durable=true;
        // 指定一个队列
        channel.queueDeclare(queue,durable,false,false ,null);
        for(int i=0;i<5;i++) {
            // 发送的消息
            String message="郑印--"+i;
            //往队列中发出一条消息
            channel.basicPublish("",queue,null,message.getBytes());
            System.out.println("发送的消息："+message);
        }
        channel.close();
        connection.close();
    }
}

