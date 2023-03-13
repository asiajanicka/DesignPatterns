package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String name;
    private List<Subscriber> subscribers;

    public Channel(String name){
        this.name = name;
        subscribers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
        subscriber.setChannel(this);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifyAllSubscribers(){
        for(Subscriber sub: subscribers){
            sub.update();
        }
    }
}
