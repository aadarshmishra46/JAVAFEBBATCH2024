package org.example;

import java.util.Scanner;

public class SeprateString {
    public static void main(String[] args) {
        System.out.println("Please Enter Your String:- ");

        Scanner sc =new Scanner(System.in);

 // 3
       String first = sc.nextLine();
       String second = sc.nextLine();
       String third = sc.nextLine();
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);

        System.out.printf(first+"\n"+second+"\n"+third);

    }
}
