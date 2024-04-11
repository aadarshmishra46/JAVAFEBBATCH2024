package org.example.ThreadPrac;

public class MyThead extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("child Thead");
        }
    }



}
