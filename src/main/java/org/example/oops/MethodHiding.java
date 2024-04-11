package org.example.oops;

public class MethodHiding {
    public static  void m1(){
        // compile time
        System.out.println("m1 method of class Method Hiding");
    }
    public void m2(){
        System.out.println("m2 method of class Method Hiding");
    }

}
 class Example extends MethodHiding{
    public static void m1(){

        System.out.println("m1 method of class Example");
    }
     public void m2(){
         System.out.println("m2 method of class example");
     }
}
class MethodHidingMain{
    public static void main(String[] args) {
        MethodHiding methodHiding = new MethodHiding(); //
         MethodHiding methodHiding1   = new Example();
         Example example = new Example();
        methodHiding.m1();
        methodHiding1.m1(); // Hiding
        example.m1();
        methodHiding.m2();
        methodHiding1.m2(); // overriding



    }

    /*

     */

}