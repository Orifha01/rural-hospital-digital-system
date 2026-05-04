package creational_patterns.factory_method;

public class EmailNotification implements Notification {
    public void send() {
        System.out.println("Email sent to patient");
    }
}
