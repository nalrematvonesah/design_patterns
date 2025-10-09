package org.example.bridge_pattern.notifications;

import org.example.bridge_pattern.senders.IMessageSender;

public interface Notification {
    void send(String title, String message);
}
