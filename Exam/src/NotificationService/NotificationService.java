package NotificationService;

import Message.Message;
import Message.States.SentState;
import User.Subscriber;

import java.util.HashSet;
import java.util.Set;

public class NotificationService implements Publisher {

    static private NotificationService instance = null;

    private Set<Subscriber> subs = new HashSet<>();

    private NotificationService(){

    }

    public static NotificationService getInstance (){
        if (instance==null){
            instance = new NotificationService();
        }
        return instance;
    }

    public void sendMessage(Message message){
        System.out.println("Sending message:\n"+ message.getText());
        notifySubs(message);
        message.setState(new SentState());
    }

    private void notifySubs(Message message) {
        for (Subscriber sub : subs){
            sub.update(message);
        }
    }

    @Override
    public void addSub(Subscriber sub) {
        subs.add(sub);
    }

    @Override
    public void removeSub(Subscriber sub) {
        subs.remove(sub);
    }
}
