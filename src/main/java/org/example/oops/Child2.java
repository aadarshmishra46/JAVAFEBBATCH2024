package org.example.oops;
public class Child2 implements Parent {
    @Override
    public void marry() {
        System.out.println("4me, 3sha,");
    }

    @Override
    public void propeerties() {
        System.out.println("no dahej");
    }

    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.marry();
        child2.propeerties();
    }
}
