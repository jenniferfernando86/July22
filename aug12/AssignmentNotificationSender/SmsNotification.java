package aug12.AssignmentNotificationSender;

public interface SmsNotification extends NotificationSender {
    void setPhoneNumbers(int phoneNumber);

    void sendSMSNotification();

}
