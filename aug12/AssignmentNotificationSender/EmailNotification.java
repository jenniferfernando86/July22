package aug12.AssignmentNotificationSender;

public interface EmailNotification extends NotificationSender {

    void setRecipientEmail(String emailAddress);
    void sendEmailNotification();
}
