package Observer.Observer_Practice.notification;

import Observer.Observer_Practice.WeatherForecast.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
