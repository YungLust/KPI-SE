package NotificationService;

import User.Subscriber;

public interface Publisher {
    void addSub(Subscriber sub);
    void removeSub(Subscriber sub);
}
