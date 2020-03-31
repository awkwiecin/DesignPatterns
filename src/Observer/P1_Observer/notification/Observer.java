package Observer.P1_Observer.notification;

import Observer.P1_Observer.WeatherForecast.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
