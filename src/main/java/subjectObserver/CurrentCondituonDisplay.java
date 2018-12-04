package subjectObserver;

public class CurrentCondituonDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentCondituonDisplay(Subject subject) {
        this.weatherData = subject;
        //注册观察者
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
