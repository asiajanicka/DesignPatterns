package org.example.strategy;

public class CardPayment implements IPay{
    @Override
    public void pay() {
        System.out.println("I pay with card");
    }
}
