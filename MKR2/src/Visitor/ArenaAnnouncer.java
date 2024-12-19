package Visitor;

import java.util.Arrays;
import java.util.HashSet;
import Heroes.*;

public class ArenaAnnouncer implements Announcer {

    private HashSet<Subscriber> subs = new HashSet<>();

    @Override
    public void notifySubs(String message) {
        for (Subscriber sub : subs){
            sub.update(message);
        }
    }

    @Override
    public void addSub(Subscriber newSub) {
        subs.add(newSub);
    }

    @Override
    public void removeSub(Subscriber oldSub){
        subs.remove(oldSub);
    }
}
