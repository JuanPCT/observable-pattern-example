package com.observablepattern;

public class UserInteface implements Observer{

    private WeatherStation weatherStation;

    public UserInteface(){
        weatherStation = WeatherStation.getWeatherStation();
    }

    @Override
    public void update(int temperature, int windSpeed, int pressure) {
        display(temperature, windSpeed, pressure);        
    }
    
    private void display(int temperature, int windSpeed, int pressure){
        System.out.println("DisplayLa temperatura es: "+ temperature+" la velocidad del viento es: "
        +windSpeed+" y la presion atmosferica es: "+ pressure);
    }

    public WeatherStation getWeatherStation(){
        return this.weatherStation;
    }
}
