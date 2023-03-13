package org.example.decorator;

public abstract class DrinkDecorator implements ICost{
    protected ICost addOn;

    public DrinkDecorator(ICost addOn){
        this.addOn = addOn;
    }
    @Override
    public  int calculateCost(){
        return addOn.calculateCost();
    }
}
