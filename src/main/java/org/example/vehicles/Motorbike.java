package org.example.vehicles;

public class Motorbike extends Vehicle {
    private final double frontWheelDiameter;
    private final double backWheelDiameter;

    public Motorbike() {
        super("мотицикл", 2, 200);
        this.frontWheelDiameter = 431.8;
        this.backWheelDiameter = 431.8;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nДиаметр переднего колеса: " + this.frontWheelDiameter + "мм"
                + "\nДиаметр заднего колеса: " + this.backWheelDiameter + "мм";
    }
}
