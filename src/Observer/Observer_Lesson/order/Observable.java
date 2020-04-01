package Observer.Observer_Lesson.order;

import Observer.Observer_Lesson.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifiyObserver();
}
