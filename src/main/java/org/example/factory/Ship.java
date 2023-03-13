package org.example.factory;

public class Ship implements IDeliver{
    @Override
    public void deliver() {
        System.out.println("Ship delivers load in the sea and rivers");
    }
}
