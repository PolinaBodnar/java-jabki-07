package org.example;

public class Truck extends VehicleOne {
    public Truck(int maxSpeed, int cargoCapacity) {
        super(maxSpeed, cargoCapacity);
    }

    @Override
    public void deliver(String destination) {
        System.out.print("Грузовик загружен. ");
        super.deliver(destination);
    }
}
