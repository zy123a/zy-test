package com.zy.rabbitMq;

import com.rabbitmq.client.*;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/1/5
 * Time:12:09
 */
public class FanoutExchangSend {

    public static final String exchangName="ex_log";

    public static void main(String[] args) throws Exception{
        ConnectionFactory connectionFactory=new ConnectionFactory();
        connectionFactory.setHost("localhost");
        Connection connection=connectionFactory.newConnection();
        Channel channel=connection.createChannel();
        // 声明交互器
        channel.exchangeDeclare(exchangName,"fanout");
        for(int i=0;i<10;i++){
            String message="新年快乐:"+i;
            channel.basicPublish(exchangName,"", MessageProperties.TEXT_PLAIN,message.getBytes());
            System.out.println("发送的消息：" + message);
        }
        channel.close();
        connection.close();
    }
}
