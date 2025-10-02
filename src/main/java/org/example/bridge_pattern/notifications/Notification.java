package org.example.bridge_pattern.notifications;

import org.example.bridge_pattern.senders.IMessageSender;

public abstract class Notification {
    protected IMessageSender sender;

    protected Notification(IMessageSender sender) {
        this.sender = sender;
    }
    public abstract void send(String title, String message);
}
