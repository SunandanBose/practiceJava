package com.practice.pubsub;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;
import java.util.Observer;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MessageSubscriber implements Observer {

    private String name;
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Message) {
            Message message = (Message) arg;
            System.out.println(name + " received message: " + message.getContent());
        }
    }
}
