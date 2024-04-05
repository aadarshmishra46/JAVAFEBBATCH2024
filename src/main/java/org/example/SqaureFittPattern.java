package org.example;

import java.util.Scanner;

public class SqaureFittPattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n;i++){
            // 0,1,2,3,4< 5
            for (int j=0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
/*
i    j
0    0 , 1,2,3,4
1    0 , 1,2,3,4
2    0 , 1,2,3,4
3   0 , 1,2,3,4
4   0 , 1,2,3,4







 */


//        *
//
//        * *
//        * *
//
//        * * *
//        * * *
//        * * *
//
//        * * * *
//        * * * *
//        * * * *
//        * * * *
//
//
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *
    }
}
