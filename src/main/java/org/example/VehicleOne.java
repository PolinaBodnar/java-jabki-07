package org.example;

public class VehicleOne {
    private String brand;
    private int maxSpeed;
    private int cargoCapacity;

    // Конструктор для brand
    public VehicleOne(String brand) {
        this.brand = brand;
        System.out.println("Создан транспорт: " + brand);
    }

    // Конструктор для maxSpeed и cargoCapacity
    public VehicleOne(int maxSpeed, int cargoCapacity) {
        this.maxSpeed = maxSpeed;
        this.cargoCapacity = cargoCapacity;
        System.out.println("Создан транспорт со скоростью " + maxSpeed + " и грузоподъемностью " + cargoCapacity);
    }

    public void startEngine() {
        if (brand != null) {
            System.out.println("Двигатель запущен для: " + brand);
        } else {
            System.out.println("Двигатель запущен для транспорта со скоростью: " + maxSpeed);
        }
    }

    public void deliver(String destination) {
        System.out.println("Доставка в " + destination);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}
