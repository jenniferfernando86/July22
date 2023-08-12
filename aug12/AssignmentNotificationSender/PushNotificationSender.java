package aug12.AssignmentNotificationSender;

public class PushNotificationSender implements PushNotification {

    String deviceName;
    String message;


    @Override
    public void sendNotification(String message) {
        this.message = message;

    }

    @Override
    public void setDevices(String deviceName) {
        this.deviceName = deviceName;

    }

    @Override
    public void sendPushNotification() {
        System.out.println("'" + message + "' has been sent to your device " + deviceName);

    }
}
