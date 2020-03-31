package Observer.P1_Observer.weather;

import Observer.S1_Observer.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();



}
