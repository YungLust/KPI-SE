public class Main {
    public static void main(String[] args) {
        Message msg = new TextMessage("Hi! I have some information for you.");
        System.out.println("*\n" + msg.send());

        Message compressedMsg = new CompressionDecorator(msg,"_");
        System.out.println("*\n" + compressedMsg.send());

        Message encryptedMsg = new EncryptionDecorator(compressedMsg, 900);
        System.out.println("*\n" + encryptedMsg.send());

        Message authorMsg = new AuthorDecorator(encryptedMsg, "Artur Yanchuk");
        System.out.println("*\n" + authorMsg.send());

        Message dateTimeMsg = new DateTimeDecorator(authorMsg, "06.11.2024", "11:30");
        System.out.println("*\n" + dateTimeMsg.send());

        Message unEncryptedMsg = new EncryptionDecorator(dateTimeMsg, -900);
        System.out.println("*\n" + unEncryptedMsg.send());

    }
}
