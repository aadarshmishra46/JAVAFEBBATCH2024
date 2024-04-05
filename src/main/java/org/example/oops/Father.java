package org.example.oops;

public class Father {
    String occupation;
    double height;

    double weight;

    double residance;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        System.out.println("father method");
        System.out.println("line 33"+weight);
        this.weight = weight;
    }

    public double getResidance() {
        return residance;
    }

    public void setResidance(double residance) {
        this.residance = residance;
    }
}
