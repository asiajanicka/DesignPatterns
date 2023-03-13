package org.example.strategy;

public class BlikPayment implements IPay{
    @Override
    public void pay() {
        System.out.println("I pay with Blik");
    }
}
