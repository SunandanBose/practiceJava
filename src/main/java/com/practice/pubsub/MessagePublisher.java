package com.practice.pubsub;

import java.util.Observable;

public class MessagePublisher extends Observable {

    public void sendMessage(String content) {
        Message message = new Message(content);
        setChanged();
        notifyObservers(message);
    }
}
