package main.java.Entity;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private final String name;
    private String color;
    private final String brand;

    public Vehicle(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public final void di() {

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
