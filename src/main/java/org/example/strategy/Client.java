package org.example.strategy;

public class Client {
    private IPay paymentMethod;

    public Client(IPay paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void payForCloths(){
        paymentMethod.pay();
    }
}
