package org.example;

public class Product {

    private double cost;
    private String name;
    public Product(String name, double cost) {
        this.cost = cost;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + ": " + getCost();
    }

    public double getCost() {
        return cost;
    }
}
