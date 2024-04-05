package org.example;

import java.util.Scanner;

public class WhileLoopPrac {
    public static void main(String[] args) {
        System.out.println("Enter number for table result: ");
        Scanner sc =new Scanner(System.in);
        int table =sc.nextInt();
        int i=1;
        while(i<11){ // 1 <11
            System.out.println(table*i); // = 2 , 12
            i++;
        }
    }
}
