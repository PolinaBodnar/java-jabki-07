package org.example;

public class DeliveryDemo {
    public static void startDelivery(VehicleOne vehicle, String address) {
        vehicle.deliver(address);
    }

    public static void main(String[] args) {
        VehicleOne truck = new Truck(80, 5000);
        VehicleOne drone = new Drone(60, 10);

        startDelivery(truck, "Москва");
        startDelivery(drone, "Питер");
    }
}
