package org.example.vehicles;

public class Bus extends Vehicle {
    private final int seatsCount;

    public Bus() {
        super("автобус", 6, 100);
        this.seatsCount = 40;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nКоличество посадочных мест: " + this.seatsCount;
    }
}
