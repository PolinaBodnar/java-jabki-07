package org.example;

public class Main {
    public static void main(String[] args) {

        // ==== 1. Банковские счета ====
        System.out.println("--- Банковские счета ---");
        Account[] accounts = {
                new SavingsAccount("ACC123", 5000, 0.05),
                new CreditAccount("ACC456", 1000, 500)
        };

        accounts[0].deposit(1000);
        accounts[1].withdraw(1200);

        for (Account acc : accounts) {
            acc.withdraw(200);
            acc.displayInfo();
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).applyInterest();
                acc.displayInfo();
            }
        }

        // ==== 2. Система доставки ====
        System.out.println("\n--- Система доставки ---");
        VehicleOne truck = new Truck(120, 10000);
        VehicleOne drone = new Drone(60, 5);

        startDelivery(truck, "Москва");
        startDelivery(drone, "Санкт-Петербург");

        // ==== 3. Зоопарк ====
        System.out.println("\n--- Зоопарк ---");
        Animal[] zoo = {
                new Lion("Лев", 5),
                new Parrot("Кеша", 2)
        };

        for (Animal animal : zoo) {
            animal.makeSound();
            animal.eat();
            if (animal instanceof Lion) {
                ((Lion) animal).hunt();
            }
        }

        // ==== 4. Игровые персонажи ====
        System.out.println("\n--- Игровые персонажи ---");
        Warrior warrior = new Warrior("Артур", 100);
        Mage mage = new Mage("Мерлин", 80);

        System.out.println(warrior.getName() + " атакует:");
        warrior.attack();
        mage.takeDamage(20);

        System.out.println(mage.getName() + " атакует:");
        mage.attack();
        warrior.takeDamage(30);

        warrior.block();
        mage.heal();
    }

    public static void startDelivery(VehicleOne vehicle, String address) {
        vehicle.deliver(address);
    }
}
