package Visitor;

import java.util.Arrays;
import java.util.HashSet;
import Heroes.*;

public class ArenaAnnouncer implements Announcer {

    private HashSet<Subscriber> subs = new HashSet<>();

    @Override
    public void notifySubs(Hero hero) {
        for (Subscriber sub : subs){
            sub.update(hero);
        }
    }

    @Override
    public void addSubs(Subscriber ... newSubs) {
        subs.addAll(Arrays.asList(newSubs));
    }
}
