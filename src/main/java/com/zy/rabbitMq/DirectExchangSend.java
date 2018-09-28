package com.zy.rabbitMq;

import com.rabbitmq.client.*;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/1/5
 * Time:17:47
 */
public class DirectExchangSend {
    public static final String exchangName="ex_log_direct";

    public static void main(String[] args) throws Exception{
        ConnectionFactory connectionFactory=new ConnectionFactory();
        connectionFactory.setHost("localhost");
        Connection connection=connectionFactory.newConnection();
        Channel channel=connection.createChannel();
        // 声明交互器
        channel.exchangeDeclare(exchangName,"direct");
        for(int i=0;i<10;i++){
            String message=getKey(i)+"新年快乐:";
            channel.basicPublish(exchangName,getKey(i), MessageProperties.TEXT_PLAIN,message.getBytes());
            System.out.println("发送的消息：getKey(i)" + message);
        }
        channel.close();
        connection.close();
    }

    public static String getKey(int i) {
        int m=i%3;
        if(m==0){
            return "info";
        } else if (m == 1) {
            return "warn";
        }else {
            return "error";
        }


    }
}
