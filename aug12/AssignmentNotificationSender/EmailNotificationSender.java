package aug12.AssignmentNotificationSender;

public class EmailNotificationSender implements EmailNotification {
    String emailAddress;
    String message;

    @Override
    public void setRecipientEmail(String emailAddress) {
        this.emailAddress = emailAddress;

    }
    @Override
    public void sendNotification(String message) {
        this.message = message;
    }
    @Override
    public void sendEmailNotification() {
        System.out.println("The message '" + message + "' has been sent to the email address " + emailAddress);

    }


}
