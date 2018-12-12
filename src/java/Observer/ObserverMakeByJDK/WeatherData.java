package Observer.ObserverMakeByJDK;


import java.util.Observable;

public class WeatherData extends Observable {              //继承了JDK内置的Observable父类，不需要再自己实现观察者的增加和删改了
     private float temperature;
     private float humidity;
     private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        //这里可以设置条件来调用setchanged, 否则轻微的变动不notify观察者。 比如设置一个条件 if 温差大于多少度时，才能setchanged,
        setChanged();                         //设置变化位位true
        notifyObservers();                    //通知完后将change属性改回false
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
