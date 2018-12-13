package Command;

import javafx.beans.Observable;

public class CeilingFan {
    public static int HIGH = 3;
    public static int MEDIUM = 2;
    public static int LOW = 1;
    public static int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void High() {
        speed = HIGH;
    }

    public void Medium() {
        speed = MEDIUM;
    }

    public void Low() {
        speed = LOW;
    }
    public void Off() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
