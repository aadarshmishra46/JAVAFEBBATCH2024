package org.example.ThreadPrac;

public class MultiTheadingDemo {
    public static void main(String[] args) {
    MyThead thread = new MyThead();
    thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
