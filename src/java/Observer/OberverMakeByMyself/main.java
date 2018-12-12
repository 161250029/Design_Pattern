package Observer.OberverMakeByMyself;


public class main {
    public static void main(String args[]) {
         Oversable oo = new WeatherData();
         Observer o = new CurrentConditionDisplay(oo);
         oo.notified();
    }
}
