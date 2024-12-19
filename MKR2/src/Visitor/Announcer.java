package Visitor;

import Heroes.Hero;

public interface Announcer {
    public void notifySubs(String message);

    public void addSub(Subscriber newSub);

    public void removeSub(Subscriber oldSub);
}
