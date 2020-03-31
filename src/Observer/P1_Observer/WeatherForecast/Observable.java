package Observer.P1_Observer.WeatherForecast;

import Observer.P1_Observer.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifiObservers();
}
