package com.zpdu.test03;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)  {
        try {
            Scanner scanner = new Scanner(System.in);
            Socket socket = new Socket("127.0.0.1", 7777);
            while (true) {
                OutputStream outputStream = socket.getOutputStream();
                PrintStream printStream = new PrintStream(outputStream);
                String s = scanner.nextLine();
                printStream.println(s);
                printStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        }


    }

