package org.example;

public class Toys {

    private int id;
    private String name;
    private int count;

    private double FinaldropChance;

    public double getFinaldropChance() {
        return FinaldropChance;
    }

    public void setFinaldropChance(double finaldropChance) {
        FinaldropChance = finaldropChance;
    }


    public Toys(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

}
