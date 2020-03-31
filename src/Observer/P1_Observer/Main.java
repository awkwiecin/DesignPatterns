package Observer.P1_Observer;

import Observer.P1_Observer.WeatherForecast.WeatherForecast;
import Observer.P1_Observer.notification.InternetNews;
import Observer.P1_Observer.notification.RadioNews;
import Observer.P1_Observer.notification.TvNews;

public class Main {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifiObservers();
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
        weatherForecast.updateForcast(18, 1007);
    }
}
