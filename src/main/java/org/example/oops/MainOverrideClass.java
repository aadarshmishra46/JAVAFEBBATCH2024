package org.example.oops;

public class MainOverrideClass {
    public static void main(String[] args) {
        Son son= new Son();
        Father father = new Father();
        son.setWeight(50.5);
      //  father.setWeight(60.5);
        System.out.println(father.getWeight());
        System.out.println(son.getWeight());
    }
}
