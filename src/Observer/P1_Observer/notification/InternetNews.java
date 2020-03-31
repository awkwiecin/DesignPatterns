package Observer.P1_Observer.notification;

import Observer.P1_Observer.WeatherForecast.WeatherForecast;

public class InternetNews implements Observer{
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowaprognozapogody:temperatura: "+ weatherForecast.getTemprerature()+ "stopni, ciśnienie: "+weatherForecast.getPresure()+"hpi");

    }
}
