package org.example.oops;

public class MethodSignature {
  private   String color;
  private   int age;

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getAge(double d) {
        return age;
    }

    public static void main(String[] args) {
       MethodSignature methodSignature = new MethodSignature();
       methodSignature.setAge(50);
       methodSignature.setColor("blue");
        System.out.println(methodSignature.getAge());
        System.out.println(methodSignature.getColor());
        main(5,"hello");
        main("hello",6);

    }

    public static void main(int a,String b){ // this is different method because method signature , overloding

    }
    public static void main(String b,int a){ // this is different method because method signature , overloding

    }

}
