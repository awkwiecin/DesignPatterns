package Observer.P1_Observer.WeatherForecast;

import Observer.P1_Observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    int temprerature;
    int presure;
    Set<Observer> registerObserver = new HashSet<Observer>();

    public WeatherForecast(int temprerature, int presure) {
        this.temprerature = temprerature;
        this.presure = presure;
    }

    public int getTemprerature() {
        return temprerature;
    }

    public void setTemprerature(int temprerature) {
        this.temprerature = temprerature;
    }

    public int getPresure() {
        return presure;
    }

    public void setPresure(int presure) {
        this.presure = presure;
    }



    public void registerObserver(Observer observer) {
        registerObserver.add(observer);


    }

    public void unregisterObserver(Observer observer) {
        registerObserver.remove(observer);


    }

    public void notifiObservers() {
        for(Observer observer : registerObserver){
            observer.updateForecast(this);
        }

    }
    public void updateForcast(int temprerature, int presure){
        setTemprerature(temprerature);
        setPresure(presure);
        notifiObservers();
    }
}
