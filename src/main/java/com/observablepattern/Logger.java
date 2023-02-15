package com.observablepattern;

public class Logger implements Observer{

    private WeatherStation weatherStation;

    public Logger(){
        weatherStation = WeatherStation.getWeatherStation();    }

    @Override
    public void update(int temperature, int windSpeed, int pressure) {
        log(temperature, windSpeed, pressure);
    }
    
    private void log(int temperature, int windSpeed, int pressure){
        System.out.println("Log La temperatura es: "+ temperature+" la velocidad del viento es: "
        +windSpeed+" y la presion atmosferica es: "+ pressure);
    }

    public WeatherStation getWeatherStation(){
        return this.weatherStation;
    }
}
