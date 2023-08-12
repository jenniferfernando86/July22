package aug12.AssignmentNotificationSender;

public class SmsNotificationSender implements SmsNotification{

    int phoneNumber;
    String message;


    @Override
    public void sendNotification(String message) {
        this.message = message;
    }

    @Override
    public void setPhoneNumbers(int phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    @Override
    public void sendSMSNotification() {
        System.out.println("The message '" + message + "' has been sent to the phone number " + phoneNumber);


    }
}
