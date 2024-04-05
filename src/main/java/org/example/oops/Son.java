package org.example.oops;

public class Son extends Father{
    @Override
    public void setWeight(double weight) {
        System.out.println(" i am overridend method");
       // this.weight = weight;
        super.setWeight(weight);

    }
}
