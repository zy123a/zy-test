package com.zy.niosocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Random;
import java.util.Set;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2018/2/7
 * Time:16:02
 */
public class NioServer {
    private ServerSocketChannel serverSocketChannel = null;
    private SocketChannel socketChannel = null;
    private Selector selector = null;

    public NioServer() throws IOException {
        serverSocketChannel = ServerSocketChannel.open();
        ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.bind(new InetSocketAddress("localhost", 9991));
        serverSocketChannel.configureBlocking(false);
        selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
    }

    public static void main(String[] args) throws IOException {
        NioServer nioServer = new NioServer();
        while (true) {
            if (nioServer.selector.select() == 0) {
                return;
            }
            Set<SelectionKey> keySet = nioServer.selector.selectedKeys();
            for(SelectionKey key : keySet) {
                if (key.isAcceptable()) {
                    SocketChannel socketChannel = ((ServerSocketChannel) key.channel()).accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(nioServer.selector, SelectionKey.OP_READ);
                }
                if (key.isReadable()) {
                    SocketChannel socketChannel = (SocketChannel) key.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    while (socketChannel.read(byteBuffer) > 0) {
                        byteBuffer.flip();
                        System.out.println(byteBuffer.toString());
                        byteBuffer.clear();
                    }
                    socketChannel.register(nioServer.selector, SelectionKey.OP_WRITE);
                }
                if (key.isWritable()) {
                    SocketChannel socketChannel = (SocketChannel) key.channel();
                    ByteBuffer byteBuffer = ByteBuffer.wrap(new String("zhengyin"+ new Random(2).nextInt()).getBytes());
                    while (byteBuffer.hasRemaining()) {
                        socketChannel.write(byteBuffer);
                    }
                    key.interestOps(SelectionKey.OP_READ);
                }
                keySet.remove(key);
            }
        }
    }
}
