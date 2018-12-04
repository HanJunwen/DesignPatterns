package subjectObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float tempterature;
    private float pressure;
    private float humidity;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeOberver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(tempterature, humidity, pressure);
        }
    }

    /**
     * 气象站得到更新的观察数据，通知观察者
     */
    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurements(float tempterature, float humidity, float pressure) {
        this.tempterature = tempterature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
