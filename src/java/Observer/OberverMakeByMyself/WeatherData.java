package Observer.OberverMakeByMyself;

import java.util.ArrayList;

public class WeatherData implements Oversable{               //被观察者
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void notified() {
        for(Observer o : observers) {
            o.update(temperature , humidity);
        }
    }

    @Override
    public void regsiter(Observer observer) {
          this.observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
          int i = observers.indexOf(observer);
          if(i > 0) {
              this.observers.remove(i);
          }

        //this.observers.remove(observer);  直接这样应该也是可以达到相同效果的吧
    }

    public void measurementsChanged() {
        notified();
    }

    public void setMeasurements(float temperature , float humidity , float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
