package Command;

public class Light {
      String place;

    public Light(String place) {
        this.place = place;
    }
    public void on() {
        System.out.println(place + "'s light is on");
    }

    public void off() {
        System.out.println(place + "'s light is off");
    }
}
