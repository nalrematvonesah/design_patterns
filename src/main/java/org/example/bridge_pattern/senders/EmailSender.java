package org.example.bridge_pattern.senders;

public class EmailSender implements IMessageSender {
    @Override
    public void sendMessage(String title, String body) {
        System.out.println("--- Sending via EMAIL ---");
        System.out.println("To: user@example.com");
        System.out.println("Subject: " + title);
        System.out.println("Body: " + body + "\n");
    }
}