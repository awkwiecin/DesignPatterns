package Observer.Practice_1_Observer.WeatherForecast;

import Observer.Practice_1_Observer.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
