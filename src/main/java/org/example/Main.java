package org.example;

import org.example.vehicles.Vehicle;
import org.example.vehicles.VehicleFactory;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        for (String arg : args) {
            try {
                int menuOption = Integer.parseInt(arg);
                Vehicle vehicle = factory.createVehicle(menuOption);
                if (vehicle == null) {
                    System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
                } else {
                    System.out.println(vehicle);
                }
            } catch (InputMismatchException exception) {
                exception.printStackTrace();
            }
        }
    }
}