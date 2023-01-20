package org.example;

public class Juice extends Product{
    private String flavor;
    private TypeSize size;
    public Juice(String name, double cost, String flavor, TypeSize size){
        super(name, cost);
        this.flavor = flavor;
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " flavor " + this.flavor + " size: " + this.size;
    }
}
