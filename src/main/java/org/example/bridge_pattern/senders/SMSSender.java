package org.example.bridge_pattern.senders;

public class SMSSender implements IMessageSender {
    @Override
    public void sendMessage(String title, String body) {
        System.out.println("--- Sending via SMS ---");
        System.out.println("Phone: +1-555-123-4567");
        System.out.println("Subject: " + title);
        System.out.println("Message: " + body + "\n");
    }
}