package org.example.vehicles;

public class VehicleFactory {
    public Vehicle createVehicle(Integer vehicleType) {
        switch (vehicleType) {
            case 0:
                return new Motorbike();
            case 1:
                return new Scooter();
            case 2:
                return new Car();
            case 3:
                return new Bus();
            default:
                return null;
        }
    }
}
