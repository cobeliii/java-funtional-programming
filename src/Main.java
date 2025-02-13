public class Main {
    public static void main(String[] args) {
        EmailSender sender = new Gmail();
        sender.send();

        EmailSender emailSender = new EmailSender() {
            @Override
            public void send() {
                System.out.println("Sending email in a different way");
            }
        };

        emailSender.send();

        //Using lambda now
        EmailSender emailSender2 = () -> System.out.println("Sending email in a different way part 2");
        emailSender2.send();
    }
}