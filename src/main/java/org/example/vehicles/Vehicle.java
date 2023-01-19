package org.example.vehicles;

public abstract class Vehicle {
    protected String name;
    protected int wheelsCount;
    protected int maximumSpeed;

    @Override
    public String toString() {
        return "\nНаименование транспорта: " + this.name
                + "\nКоличество колес: " + this.wheelsCount
                + "\nМаксимальная скорость: " + this.maximumSpeed + "км/ч";
    }

    public Vehicle(String name, int wheelsCount, int maximumSpeed) {
        this.name = name;
        this.wheelsCount = wheelsCount;
        this.maximumSpeed = maximumSpeed;
    }
}
