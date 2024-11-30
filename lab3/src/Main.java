/**
 * Main.Main class creates text message and then adds image file and audio to it.
 */
public class Main {
    public static void main(String[] args) {
        Message Msg = new TextMessage("Hi! I have some information for you.");
        System.out.println("*\n" + Msg.send());
        Message ImageMsg = new ImageDecorator(Msg, "Image1.png");
        System.out.println("*\n" + ImageMsg.send());
        Message FileImageMsg = new FileDecorator(ImageMsg, "Main.java");
        System.out.println("*\n" + FileImageMsg.send());
        Message FileAudioImageMsg = new AudioDecorator(FileImageMsg, "Congratulations.mp3");
        System.out.println("*\nYou have new message:\n" + FileAudioImageMsg.send());
    }
}
