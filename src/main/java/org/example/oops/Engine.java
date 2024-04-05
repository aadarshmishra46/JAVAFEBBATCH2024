package org.example.oops;

public class Engine {

    private int BS;
    private double hoursePower;

    private int gares;

    public void start(){
        System.out.println("engine is on");
    }

    public void stop(){
        System.out.println("engine is off");

    }


    public int getBS() {
        return BS;
    }

    public void setBS(int BS) {
        this.BS = BS;
    }


    public double getHoursePower() {
        return hoursePower;
    }

    public void setHoursePower(double hoursePower) {
        this.hoursePower = hoursePower;
    }

    public int getGares() {
        return gares;
    }

    public void setGares(int gares) {
        this.gares = gares;
    }
}
