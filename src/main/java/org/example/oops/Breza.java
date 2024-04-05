package org.example.oops;

public class Breza extends Car{ // is a relationship

    public static void main(String[] args) {
        Breza breza = new Breza();
        breza.setColur("white");
        System.out.println(breza.getColur());

        Engine engine = new Engine(); // has a rleation ship
        engine.start();

    }

}
