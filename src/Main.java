import com.cobeliii.EmailSender;

public class Main {
    public static void main(String[] args) {
//        com.cobeliii.EmailSender sender = new com.cobeliii.Gmail();
//        sender.send();

        EmailSender gmail = (from, to) -> {
            //logic
            //more logic
            var isValidEmail = from.contains("@");
            System.out.println("Sending email via com.cobeliii.Gmail...");
        };

        gmail.send("abc@gmail.com", "abc@hotmail.com");

        //Using lambda now
        EmailSender hotmail = (from, to) -> System.out.println("Sending email via com.cobeliii.Hotmail...");
        hotmail.send("abc@hotmail.com", "abc@gmail.com");
    }
}