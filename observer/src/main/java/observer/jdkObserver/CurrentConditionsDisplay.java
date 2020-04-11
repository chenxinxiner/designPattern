package observer.jdkObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 当前天气布告板（观察者）
 *
 * @author ：chenxin
 * @date ：Created in 2020/4/11 10:18
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            dispaly();
        }
    }

    @Override
    public void dispaly() {
        System.out.println("CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}');
    }

}
