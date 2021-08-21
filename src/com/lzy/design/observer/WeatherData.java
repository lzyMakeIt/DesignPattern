package com.lzy.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lzy
 * @Date: 2021/8/20 16:58
 * @Description: 具体主题
 */
public class WeatherData implements Subject {
    private List<Observer> observers;

    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    public WeatherData(){
        observers=new ArrayList<>();
    }

    public void change(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update();
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
