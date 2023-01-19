package org.example.vehicles;

public class Scooter extends Vehicle {
    private final String material;

    public Scooter() {
        super("Самокат", 2, 25);
        this.material = "аллюминий";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nМатериал корпуса: " + this.material;
    }
}
