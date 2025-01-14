package Main;

import Message.Decorator.AdvertisementMessage;
import Message.Decorator.EncryptedMessage;
import NotificationService.*;
import User.*;
import Message.*;



public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = NotificationService.getInstance();

        User user1 = new User("John");
        User user2 = new User("Paul");
        User user3 = new User("George");
        User user4 = new User("Ringo");

        notificationService.addSub(user1);
        notificationService.addSub(user2);
        notificationService.addSub(user3);
        notificationService.addSub(user4);


        Message message = new Message("New product: Electric Light Orchestra only for 99$");

        Message encryptedMsg = new EncryptedMessage(message);
        notificationService.sendMessage(encryptedMsg);

        System.out.println();
        notificationService.removeSub(user1);
        Message adMsg = new AdvertisementMessage(encryptedMsg, "Tired of coding? We have solution!");
        notificationService.sendMessage(adMsg);

        System.out.println();
        notificationService.removeSub(user2);
        notificationService.removeSub(user3);
        Message adMsg1 = new AdvertisementMessage(adMsg, "Want to live happy life? Then buy our ...");
        notificationService.sendMessage(adMsg1);

    }
}
