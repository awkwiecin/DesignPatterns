package Observer.Practice_1_Observer.notification;

import Observer.Practice_1_Observer.WeatherForecast.WeatherForecast;

public class TvNews implements Observer{
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody:temperatura: "+ weatherForecast.getTemperature()+ "stopni, ciśnienie: "+weatherForecast.getPressure()+"hpi");

    }
}
