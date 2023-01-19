package org.example.vehicles;

public class Car extends Vehicle {
    private final double trunkVolume;

    public Car() {
        super("автомобиль", 4, 150);
        this.trunkVolume = 350;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nОбъем багажника: " + this.trunkVolume + "л";
    }
}
