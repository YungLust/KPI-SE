public class Main {
    public static void main(String[] args) {
        Message msg = new TextMessage("Hi! I have some information for you.");
        System.out.println("*\n" + msg.send());

        Message encryptedMsg = new EncryptionDecorator(msg, 4);
        System.out.println("*\n" + encryptedMsg.send());

        Message encryptedCompressedMsg = new CompressionDecorator(encryptedMsg);
        System.out.println("*\n" + encryptedCompressedMsg.send());

        Message encryptedCompressedAuthorMsg = new AuthorDecorator(encryptedCompressedMsg, "Artur Yanchuk");
        System.out.println("*\n" + encryptedCompressedAuthorMsg.send());

        Message encryptedCompressedAuthorDateTimeMsg =
                new DateTimeDecorator(encryptedCompressedAuthorMsg, "06.11.2024", "11:30");
        System.out.println("*\n" + encryptedCompressedAuthorDateTimeMsg.send());

    }
}
