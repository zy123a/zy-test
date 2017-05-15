package com.zy.rabbitMq;

import com.rabbitmq.client.*;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/1/5
 * Time:17:47
 */
public class DirectExchangReceive_info {
    public static void main(String[] args)throws Exception {
        ConnectionFactory connectionFactory=new ConnectionFactory();
        connectionFactory.setHost("localhost");
        Connection connection=connectionFactory.newConnection();
        Channel channel=connection.createChannel();
        // 声明交换器
        channel.exchangeDeclare(DirectExchangSend.exchangName,"direct");
        //声明临时队列
        String queueName=channel.queueDeclare().getQueue();
        // 绑定队列到exchange
        channel.queueBind(queueName,DirectExchangSend.exchangName,"info");
        QueueingConsumer queueingConsumer=new QueueingConsumer(channel);
        channel.basicConsume(queueName,true,queueingConsumer);
        while (true) {
            QueueingConsumer.Delivery delivery=queueingConsumer.nextDelivery();
            String message=new String(delivery.getBody());
            System.out.println("接受到的消息："+message);
        }
    }
}

