package com.zy.rabbitMq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2016/12/30
 * Time:16:46
 */
public class Receive {
    private static String queue="hello";

    public static void main(String[] args) throws Exception{
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("localhost");
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();
        //设置队列持久化
        boolean durable = true;
        // 声明队列，是防止消费者先运行而队列还不存在
        channel.queueDeclare(queue, durable, false, false, null);
        // 创建队列消费者
        QueueingConsumer queueingConsumer = new QueueingConsumer(channel);
        // 设置最大服务转发消息量
        int prefetchCount = 1;
        channel.basicQos(prefetchCount);
        // 指定消费队列 指定应答模式
        boolean ack = false;
        channel.basicConsume(queue, ack, queueingConsumer);
        while (true) {
            // nextDelivery是一个阻塞方法
            QueueingConsumer.Delivery delivery = queueingConsumer.nextDelivery();
            String message = new String(delivery.getBody());
            System.out.println("接受到的消息：" + message);
            channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);
        }
    }
}
