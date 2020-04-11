package observer.jdkObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 天气预报展示面板（观察者）
 *
 * @author ：chenxin
 * @date ：Created in 2020/4/11 10:25
 */
public class PorecastDisplay implements Observer, DisplayElement {

    Observable observable;

    private float currentPressure = 29.92f;

    private float lastPressure;

    public PorecastDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.lastPressure = currentPressure;
            this.currentPressure = weatherData.getPressure();
            dispaly();
        }
    }

    @Override
    public void dispaly() {
        System.out.println("PorecastDisplay{" +
                "currentPressure=" + currentPressure +
                ", lastPressure=" + lastPressure +
                '}');
    }

    public float getCurrentPressure() {
        return currentPressure;
    }

    public float getLastPressure() {
        return lastPressure;
    }
}
