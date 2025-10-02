package org.example.bridge_pattern.senders;

public class PushNotificationSender implements IMessageSender {
    @Override
    public void sendMessage(String title, String body) {
        System.out.println("--- Sending via PUSH NOTIFICATION ---");
        System.out.println("Title: " + title);
        System.out.println("Alert: " + body + "\n");
    }
}