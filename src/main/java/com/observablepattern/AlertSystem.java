package com.observablepattern;

public class AlertSystem implements Observer{

    private WeatherStation weatherStation;

    public AlertSystem(){
        weatherStation = WeatherStation.getWeatherStation();    }

    @Override
    public void update(int temperature, int windSpeed, int pressure) {
        alert(temperature, windSpeed, pressure);
    }

    public void alert(int temperature, int windSpeed, int pressure){
        System.out.println("Alert La temperatura es: "+ temperature+" la velocidad del viento es: "
        +windSpeed+" y la presion atmosferica es: "+ pressure);
    }

    public WeatherStation getWeatherStation(){
        return this.weatherStation;
    }
    
}
