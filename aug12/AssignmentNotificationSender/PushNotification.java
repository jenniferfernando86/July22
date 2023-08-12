package aug12.AssignmentNotificationSender;

public interface PushNotification extends NotificationSender {

    void setDevices(String deviceName);
    void sendPushNotification();

}
