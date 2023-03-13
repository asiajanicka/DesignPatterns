package org.example.decorator;

public class Drink implements ICost{
    private String name;
    private int cost;

    public Drink(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public int calculateCost() {
        return cost;
    }
}
