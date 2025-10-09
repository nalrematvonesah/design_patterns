package org.example.bridge_pattern.notifications;

import org.example.bridge_pattern.senders.IMessageSender;

public class HighPriorityNotification implements Notification {
    protected IMessageSender sender;

    public HighPriorityNotification(IMessageSender sender) {
        this.sender = sender;
    }

    public void send(String title, String message) {
        String modifiedTitle = "!!! URGENT: " + title + " !!!";
        System.out.println("Notification Type: High Priority");
        sender.sendMessage(modifiedTitle, message);
    }
}
