package aug12.AssignmentNotificationSender;

public class NotificationMain {
    public static void main(String[] args) {
        EmailNotificationSender emailNotificationSender = new EmailNotificationSender();
        emailNotificationSender.setRecipientEmail("jennifer.fernando86@gmail.com");
        emailNotificationSender.sendNotification("An email has been sent to you by abc.com");
        emailNotificationSender.sendEmailNotification();

        SmsNotificationSender smsNotificationSender = new SmsNotificationSender();
        smsNotificationSender.setPhoneNumbers(1234567890);
        smsNotificationSender.sendNotification("An SMS has been sent from your Service Provider");
        smsNotificationSender.sendSMSNotification();

        PushNotificationSender pushNotificationSender = new PushNotificationSender();
        pushNotificationSender.setDevices("Iphone");
        pushNotificationSender.sendNotification("You have a new IOS update");
        pushNotificationSender.sendPushNotification();

    }
}
