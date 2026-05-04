package creational_patterns.factory_method;

public class SMSNotification implements Notification {
    public void send() {
        System.out.println("SMS sent to patient");
    }
}
