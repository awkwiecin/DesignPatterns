package Observer.Observer_Practice.WeatherForecast;

import Observer.Observer_Practice.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
