package org.example.decorator;

public class Suger extends DrinkDecorator {

    public Suger(ICost addOn) {
        super(addOn);
    }

    public int calculateCost(){
        return addOn.calculateCost() + 1;
    }

}
