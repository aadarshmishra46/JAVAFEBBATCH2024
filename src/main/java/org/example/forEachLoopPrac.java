package org.example;

public class forEachLoopPrac {
    public static void main(String[] args) {
        int [] arr = {11,2,3,4,5,6};
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//
//        }
        for (int i: arr){
            System.out.println(i);
        }
    }
}
