package com.zy.niosocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Random;
import java.util.Set;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2018/2/7
 * Time:16:27
 */
public class NioClient {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel2 = SocketChannel.open(new InetSocketAddress("localhost", 9991));
        socketChannel2.configureBlocking(false);
        final Selector selector = Selector.open();
        socketChannel2.register(selector, SelectionKey.OP_CONNECT);

        new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        if (selector.select() == 0) {
                            return;
                        }
                        Set<SelectionKey> keySet = selector.selectedKeys();
                        for(SelectionKey key : keySet) {
                            if (key.isConnectable()) {
                                SocketChannel socketChannel = (SocketChannel) key.channel();
                                if (socketChannel.finishConnect()) {
                                    key.interestOps(SelectionKey.OP_READ);
                                }
                            }
                            if (key.isReadable()) {
                                SocketChannel socketChannel = (SocketChannel) key.channel();
                                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                                while (socketChannel.read(byteBuffer) != 0) {
                                    System.out.println(byteBuffer.toString());
                                    byteBuffer.clear();
                                }
                                key.interestOps(SelectionKey.OP_WRITE);
                            }
                            if (key.isWritable()) {
                                SocketChannel socketChannel = (SocketChannel) key.channel();
                                ByteBuffer byteBuffer = ByteBuffer
                                        .wrap(new String("zhengyin" + new Random(2).nextInt()).getBytes());
                                socketChannel.write(byteBuffer);
                                key.interestOps(SelectionKey.OP_ACCEPT);
                            }
                            keySet.remove(key);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        ByteBuffer byteBuffer = ByteBuffer
                .wrap(new String("zheng帅" + new Random(2).nextInt()).getBytes());
        socketChannel2.write(byteBuffer);
    }
}
