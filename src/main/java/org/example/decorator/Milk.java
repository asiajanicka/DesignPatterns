package org.example.decorator;

public class Milk extends DrinkDecorator{
    public Milk(ICost addOn) {
        super(addOn);
    }

    @Override
    public  int calculateCost(){
        return addOn.calculateCost() + 10;
    }
}
