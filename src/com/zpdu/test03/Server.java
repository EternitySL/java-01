package com.zpdu.test03;

import javax.xml.ws.handler.Handler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class Server {


    public static void main(String[] args) {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
                    new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
            ServerSocket serverSocket = new ServerSocket(7777);
            while (true) {
                Socket accept = serverSocket.accept();
//                SreverThread sreverThread = new SreverThread(accept);
//                sreverThread.start();
                threadPoolExecutor.execute(new runnable(accept));

            }
        } catch (Exception e) {
            System.out.println("123");
        }


    }
}
