package org.example;

import org.example.vehicles.Vehicle;
import org.example.vehicles.VehicleFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            try {
                int menuOption = scanner.nextInt();
                Vehicle vehicle = factory.createVehicle(menuOption);
                if (vehicle == null) {
                    System.out.println("НЕИЗВЕСТНЫЙ ТИП ТРАНСПОРТА");
                }
                else {
                    System.out.println(vehicle);
                }
            }
            catch (InputMismatchException exception) {
                exception.printStackTrace();
            }
        }
    }

    private static void printMenu() {
        System.out.println("Выберите тип транспорта");
        System.out.println("\t0 - Мотоцикл");
        System.out.println("\t1 - Самокат");
        System.out.println("\t2 - Автомобиль");
        System.out.println("\t3 - Автобус");
    }
}