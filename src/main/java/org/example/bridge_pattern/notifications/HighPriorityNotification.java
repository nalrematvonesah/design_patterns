package org.example.bridge_pattern.notifications;

import org.example.bridge_pattern.senders.IMessageSender;

public class HighPriorityNotification extends Notification {
    public HighPriorityNotification(IMessageSender sender) {
        super(sender);
    }
    public void send(String title, String message) {
        String modifiedTitle = "!!! URGENT: " + title + " !!!";
        System.out.println("Notification Type: High Priority");
        sender.sendMessage(modifiedTitle, message);
    }
}
