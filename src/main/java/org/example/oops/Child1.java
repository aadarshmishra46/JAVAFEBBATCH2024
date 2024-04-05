package org.example.oops;
public class Child1 implements Parent {
    @Override
    public void marry() {
        System.out.println("SubhaLaxmi");
    }

    @Override
    public void propeerties() {
        System.out.println("cash gold land");
    }

    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.marry();
        child1.propeerties();
    }
}
