package org.example.strategy;

public class CashPayment implements IPay{
    @Override
    public void pay() {
        System.out.println("I pay with notes and coins");
    }
}
