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
 * Time:12:25
 */
public class FanoutExchangReceive {
   public static void main(String[] args)throws Exception {
       ConnectionFactory connectionFactory=new ConnectionFactory();
       connectionFactory.setHost("localhost");
       Connection connection=connectionFactory.newConnection();
       Channel channel=connection.createChannel();
       //声明临时队列
       String queueName=channel.queueDeclare().getQueue();
       // 绑定队列到exchange
       channel.queueBind(queueName,FanoutExchangSend.exchangName,"");
       QueueingConsumer queueingConsumer=new QueueingConsumer(channel);
       channel.basicConsume(queueName,true,queueingConsumer);
       while (true) {
           QueueingConsumer.Delivery delivery=queueingConsumer.nextDelivery();
           String message=new String(delivery.getBody());
           System.out.println("接受到的消息mm："+message);
       }
   }


}

