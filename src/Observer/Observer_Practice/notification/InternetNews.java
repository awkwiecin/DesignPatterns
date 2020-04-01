package Observer.Observer_Practice.notification;

import Observer.Observer_Practice.WeatherForecast.WeatherForecast;

public class InternetNews implements Observer{
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody:temperatura: "+ weatherForecast.getTemperature()+ "stopni, ciśnienie: "+weatherForecast.getPressure()+"hpi");

    }
}
