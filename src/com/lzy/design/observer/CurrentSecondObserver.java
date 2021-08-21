package com.lzy.design.observer;

/**
 * @Author: lzy
 * @Date: 2021/8/20 17:09
 * @Description: 观察者2
 */
public class CurrentSecondObserver extends ConditionsDisplay {
    public CurrentSecondObserver(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public void display() {
        WeatherData weatherData=getWeatherData();
        System.out.println("--- 观察者2 ---");
        System.out.println("当前气温是:"+weatherData.getTemperature());
        System.out.println("当前湿度是:"+weatherData.getHumidity());
        System.out.println("当前气压是:"+weatherData.getPressure());
    }

    @Override
    public void update() {
        System.out.println("发生变化");
        display();
    }
}
