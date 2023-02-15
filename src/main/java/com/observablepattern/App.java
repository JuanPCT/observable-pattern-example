package com.observablepattern;

public class App 
{
    public static void main( String[] args )
    {
        
        UserInteface user = new UserInteface();
        Logger logger = new Logger();
        AlertSystem alertSystem = new AlertSystem();

        user.getWeatherStation().registerObserver(user);
        logger.getWeatherStation().registerObserver(logger);
        alertSystem.getWeatherStation().registerObserver(alertSystem);

        WeatherStation.getWeatherStation().setValue(0, 0, 0);
    }
}
