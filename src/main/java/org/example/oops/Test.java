package org.example.oops;

import java.util.Scanner;

public class Test {
       static int x=5;
        int y=10;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();


        Test t1 = new Test();
        t1.x = 25;
        t1.y =35;
        System.out.println(t1.x);
        System.out.println(t1.y);



        Test t2 = new Test();


        System.out.println(t2.x);
        System.out.println(t2.y);


    }

}
