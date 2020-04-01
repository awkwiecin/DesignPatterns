package Observer.Practice_1_Observer.notification;

import Observer.Practice_1_Observer.WeatherForecast.WeatherForecast;

public class RadioNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody:temperatura: "+ weatherForecast.getTemperature()+ "stopni, ciśnienie: "+weatherForecast.getPressure()+"hpi");


    }
}
