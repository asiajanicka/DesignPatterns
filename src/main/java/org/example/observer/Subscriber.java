package org.example.observer;

public class Subscriber {
    private Channel channel;
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void update() {
        System.out.printf("%s has been notified by %s!!\n", name, channel.getName());
    }
}
