package Observer.Practice_1_Observer.notification;

import Observer.Practice_1_Observer.WeatherForecast.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
