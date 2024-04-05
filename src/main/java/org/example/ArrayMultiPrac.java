package org.example;

import java.util.Scanner;

public class ArrayMultiPrac {
    public static void main(String[] args) {
        System.out.println("please provide the array size for 2d array");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int[][] arr = new int[i][j];
    final int a= 10;

        for (int k =0; k< arr.length;k++){
            for(int l =0;l<j;l++){
                arr[k][l]  = 100;
            }
        }
        for (int k =0; k< arr.length;k++){
            for(int l =0;l<j;l++){

                System.out.println("arr["+k+","+l+"]= "+arr[k][l]);
            }
        }


//        arr[0][0] =1;
//        arr[0][1] =2;
//        arr[1][0] =3;
//        arr[1][1] =4;
//        System.out.println(arr.length);
        // n* m
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i][i]);
//
//        }

    }
}
