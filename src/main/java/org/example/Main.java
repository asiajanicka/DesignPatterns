package org.example;

import org.example.builder.Customer;
import org.example.decorator.*;
import org.example.factory.IDeliver;
import org.example.factory.TransportFactory;
import org.example.factory.TransportType;
import org.example.mvc.Controller;
import org.example.mvc.Person;
import org.example.mvc.View;
import org.example.observer.Channel;
import org.example.observer.Subscriber;
import org.example.singleton.User;
import org.example.strategy.CashPayment;
import org.example.strategy.Client;

public class Main {
    public static void main(String[] args) {

        // user as singleton
        User user = User.getInstance();

        // transport factory
        TransportFactory tf =  new TransportFactory();
        IDeliver transport = tf.getTransport(TransportType.SHIP);
        transport.deliver();

        // build customer
        Customer customer = Customer
                .builder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(24)
                .setCity("Toronto")
                .build();

        System.out.println(customer);

        // observer for subject
        Subscriber john = new Subscriber("John");
        Subscriber tom = new Subscriber("Tom");

        Channel subject = new Channel("Master Chef");
        subject.addSubscriber(john);
        subject.addSubscriber(tom);

        subject.notifyAllSubscribers();

        // decorator
        ICost coffee = new Drink("Coffee", 8);
        ICost tea = new Drink("Tea", 3);
        ICost coffeeWithSugerAndMilk = new Milk(new Suger(coffee));
        System.out.println(coffeeWithSugerAndMilk.calculateCost());
        ICost teaWithSugerAndMilk = new Milk(new Suger(tea));
        System.out.println(teaWithSugerAndMilk.calculateCost());

        //mvc
        Person person = new Person("Katty");
        View view = new View();
        Controller controller = new Controller(person, view);
        person.setController(controller);
        person.setName("Anna");

        // strategy
        Client judy = new Client(new CashPayment());
        judy.payForCloths();
    }
}