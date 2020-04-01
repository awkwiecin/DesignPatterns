package Observer.Observer_Practice;

import Observer.Observer_Practice.WeatherForecast.WeatherForecast;
import Observer.Observer_Practice.notification.InternetNews;
import Observer.Observer_Practice.notification.RadioNews;
import Observer.Observer_Practice.notification.TvNews;

public class Main {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("--------------------");
        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
        weatherForecast.updateForcast(18, 1007);
    }
}
