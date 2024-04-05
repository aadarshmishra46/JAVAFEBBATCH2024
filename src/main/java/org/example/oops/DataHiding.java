package org.example.oops;

public class DataHiding {
    public int a =5;
    private int b= 10;


    public int getA() {
        return a;
    }

    public int getB()
    {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}

