package com.zy.rabbitMq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/1/5
 * Time:18:00
 */
public class DirectExchangReceive_error {
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
        channel.queueBind(queueName,DirectExchangSend.exchangName,"warn");
        channel.queueBind(queueName,DirectExchangSend.exchangName,"error");
        QueueingConsumer queueingConsumer=new QueueingConsumer(channel);
        channel.basicConsume(queueName,true,queueingConsumer);
        while (true) {
            QueueingConsumer.Delivery delivery=queueingConsumer.nextDelivery();
            String message=new String(delivery.getBody());
            System.out.println("接受到的消息："+message);
        }
    }
}
