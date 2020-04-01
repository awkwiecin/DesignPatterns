package Observer.Practice_1_Observer.WeatherForecast;

import Observer.Practice_1_Observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {


    int temperature;
    int pressure;
    Set<Observer> registeredObservers = new HashSet<Observer>();


    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);

    }

    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }


    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.updateForecast(this);
        }


    }

    public void updateForcast(int temperature, int pressure) {
        setTemperature(temperature);
        setPressure(pressure);
        notifyObservers();
    }
}



