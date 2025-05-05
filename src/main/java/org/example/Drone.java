package org.example;

public class Drone extends VehicleOne {
    public Drone(int maxSpeed, int cargoCapacity) {
        super(maxSpeed, cargoCapacity);
    }

    @Override
    public void deliver(String destination) {
        System.out.print("Дрон взлетел. ");
        super.deliver(destination);
    }
}
