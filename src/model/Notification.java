package model;

public class Notification {

    private String notificationId;
    private String message;
    private String status;

    // Relationship
    private Patient patient;

    public Notification(String notificationId, String message) {
        this.notificationId = notificationId;
        this.message = message;
        this.status = "Pending";
    }

    public void send() {
        status = "Sent";
        System.out.println("Notification sent");
    }

    public void retry() {
        System.out.println("Retrying notification...");
    }

    public void markRead() {
        status = "Read";
    }
}
