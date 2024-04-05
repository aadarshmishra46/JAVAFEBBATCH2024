package org.example.oops;

public class Car {
    private int noOfWheel;
    private String colur;

    private double enginePower;

    public String getColur() {
        return colur;
    }

    public void setColur(String colur) {
        this.colur = colur;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public int getNoOfWheel() {
        return noOfWheel;
    }

    public void setNoOfWheel(int noOfWheel) {
        this.noOfWheel = noOfWheel;
    }
}