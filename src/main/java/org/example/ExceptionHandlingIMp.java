package org.example;

public class ExceptionHandlingIMp {
    public static void main(String[] args){
        try {
           String s= null;
            System.out.println(s.length());
        }
        catch (Exception e){
            System.out.println("null pointier");
        }
        finally {
            System.out.println("hello");
        }

    }
}
