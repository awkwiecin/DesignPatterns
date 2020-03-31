package Observer.Practice_1_Observer.notification;

import Observer.Practice_1_Observer.WeatherForecast.WeatherForecast;

public class RadioNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowaprognozapogody:temperatura: "+ weatherForecast.getTemprerature()+ "stopni, ciśnienie: "+weatherForecast.getPresure()+"hpi");


    }
}
