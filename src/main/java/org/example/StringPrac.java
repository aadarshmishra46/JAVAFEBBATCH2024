package org.example;



public class StringPrac {
    public static void main(String[] args) {
        //String literal
        String s ="AAdarsh" ; // collection of characters scp (string constant pool)
    //    System.out.println(s.hashCode());
        // 0 to 6
//        System.out.println(s.charAt(0)); // A
//        System.out.println(s.charAt(4)); // r
     //   System.out.println(s.charAt(7)); out of range
        s = "AAdarsh";
//        System.out.println(s.hashCode());
//        System.out.println(s);

        // use new keyword
        String s1 = new String("AAdarsh"); // 2 object Amit scp and Amit heap
        System.out.println(s1);
        String s3= "Amit";
        String s4 ="Amit";
//        System.out.println(s1.hashCode());
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());


       // ------------
        System.out.println(s1.equalsIgnoreCase("aadarsh"));
        s1.equals("amit");
        System.out.println(s1.contains("p"));










    }
}
