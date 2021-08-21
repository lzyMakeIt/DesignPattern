package com.lzy.design.observer;

/**
 * @Author: lzy
 * @Date: 2021/8/20 17:13
 * @Description: 提供默认实现
 */
public abstract class ConditionsDisplay implements Observer {
    private WeatherData weatherData;

    public ConditionsDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public abstract void display();
}
