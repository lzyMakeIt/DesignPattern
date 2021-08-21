package com.lzy.design.observer;

/**
 * @Author: lzy
 * @Date: 2021/8/20 17:18
 * @Description: 用户
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();

        weatherData.change(32, (float) 0.6,110);

        CurrentFirstObserver observer1=new CurrentFirstObserver(weatherData);
        CurrentSecondObserver observer2=new CurrentSecondObserver(weatherData);

        observer1.display();
        observer2.display();

        weatherData.change(30,(float) 0.5,108);
    }
}
