package com.practice.pubsub;

public class PubSubExample {

    public static void main(String[] args) {
        // Create a publisher
        MessagePublisher publisher = new MessagePublisher();

        // Create subscribers
        MessageSubscriber subscriber1 = new MessageSubscriber("Subscriber 1");
        MessageSubscriber subscriber2 = new MessageSubscriber("Subscriber 2");

        // Register subscribers with the publisher
        publisher.addObserver(subscriber1);
        publisher.addObserver(subscriber2);

        // Publish messages
        publisher.sendMessage("Hello, subscribers!");
        publisher.sendMessage("This is a second message.");
    }
}
