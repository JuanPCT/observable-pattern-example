package com.observablepattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observers;
    private int temperature, windSpeed, pressure;
    static private WeatherStation weatherStation = null;

    private WeatherStation(){
        observers = new ArrayList<>();
    }

    static public WeatherStation getWeatherStation(){
        if (weatherStation == null) {
            weatherStation = new WeatherStation();
        }
        return weatherStation;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);        
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, windSpeed, pressure);
        }
        
    }

    public void setValue(int temperature, int windSpeed, int pressure){
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        notifyObservers();
    }

}
