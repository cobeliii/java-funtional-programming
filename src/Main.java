public class Main {
    public static void main(String[] args) {
        EmailSender sender = new Gmail();
        sender.send();
    }
}