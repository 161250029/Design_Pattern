package Observer.OberverMakeByMyself;


public class CurrentConditionDisplay implements Observer{                  //  气象板类，是观察者
    private Oversable WeatherData;                    //被观察者
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Oversable weatherData) {
        this.WeatherData = weatherData;
        WeatherData.regsiter(this);
    }

    @Override
    public void update(float temperature , float humidity) {
        this.humidity = humidity;
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
