package org.example;

public class StringBufferPrac {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Aadrsah");
        System.out.println(sb.capacity()); // 16
        sb.append(" Mishra");
        System.out.println(sb);
        sb.append(6);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        StringBuilder stringBuilder = new StringBuilder("Sumit");


    }
}
