package org.example.bridge_pattern;

import org.example.bridge_pattern.notifications.HighPriorityNotification;
import org.example.bridge_pattern.notifications.LowPriorityNotification;
import org.example.bridge_pattern.senders.EmailSender;
import org.example.bridge_pattern.senders.PushNotificationSender;
import org.example.bridge_pattern.senders.SMSSender;

public class Program {
    public static void main(String[] args) {
        HighPriorityNotification highPriorityNotification = new HighPriorityNotification(new EmailSender());
        highPriorityNotification.send("Applying to the job", "QWERTYUIOP");

        HighPriorityNotification highPriorityNotification2 = new HighPriorityNotification(new SMSSender());
        highPriorityNotification2.send("Applying to the job", "QWERTYUIOP");

        LowPriorityNotification lowPriorityNotification = new LowPriorityNotification(new PushNotificationSender());
        lowPriorityNotification.send("Applying to the job", "QWERTYUIOP");
    }
}