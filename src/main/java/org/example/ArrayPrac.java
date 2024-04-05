package org.example;

import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {
        System.out.println("please enter array size");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i=0; i< array.length;i++){
            array[i] = 100*i;

        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        for (int element : array){
            System.out.println(element);
        }

        int[] array1 = {1,3,4};
    }

}
