package Observer.Lesson_1_Observer.order;

import Observer.Lesson_1_Observer.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifiyObserver();
}
