package com.zpdu.test03;

import java.io.*;
import java.net.Socket;

//public class SreverThread extends Thread{
public class runnable implements Runnable {
    Socket accept;
    public runnable(){

    }
    public runnable(Socket accept){
        this.accept = accept;
    }
    @Override
    public void run() {
        try {
            InputStream inputStream = accept.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String str ;
            while ((str =br.readLine()) != null){
                System.out.println(accept.getRemoteSocketAddress()+"你说:"+str);
            }
        } catch (IOException e) {
       
            System.out.println(accept.getRemoteSocketAddress()+"嗝屁了");
        }
    }
}
