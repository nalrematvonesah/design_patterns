package org.example.bridge_pattern.notifications;

import org.example.bridge_pattern.senders.IMessageSender;

public class LowPriorityNotification extends Notification {
    public LowPriorityNotification(IMessageSender sender) {
        super(sender);
    }

    public void send(String title, String message) {
        System.out.println("Notification type: Low Priority");
        sender.sendMessage(title, message);
    }
}

