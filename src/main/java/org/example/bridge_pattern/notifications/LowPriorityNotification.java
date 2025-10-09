package org.example.bridge_pattern.notifications;

import org.example.bridge_pattern.senders.IMessageSender;

public class LowPriorityNotification implements Notification {
    protected IMessageSender sender;

    public LowPriorityNotification(IMessageSender sender) {
        this.sender = sender;
    }

    public void send(String title, String message) {
        System.out.println("Notification type: Low Priority");
        sender.sendMessage(title, message);
    }
}

