package org.example.oops;

public class DataHidingImp {
    public static void main(String[] args) {
        DataHiding dataHiding = new DataHiding();
        System.out.println(dataHiding.a);
    //   System.out.println(dataHiding.b);
        System.out.println( dataHiding.getB());


    }
}
