package Visitor;

import Heroes.Hero;

public interface Announcer {
    public void notifySubs(Hero hero);
    public void addSubs(Subscriber ... newSubs);
}
