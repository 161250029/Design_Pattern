package Decorator;

public abstract class Beverage {              //基类
    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
