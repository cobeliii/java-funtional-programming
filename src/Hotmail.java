public class Hotmail implements EmailSender{
    @Override
    public void send() {
        System.out.println("Sending email via Hotmail...");
    }
}
