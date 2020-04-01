package Observer.Observer_Practice.notification;

import Observer.Observer_Practice.WeatherForecast.WeatherForecast;

public class TvNews implements Observer{
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody:temperatura: "+ weatherForecast.getTemperature()+ "stopni, ciśnienie: "+weatherForecast.getPressure()+"hpi");

    }
}
