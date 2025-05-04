package org.example;

public class Warrior extends Character {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Мечом в лицо!");
    }

    public void block() {
        System.out.println(name + " блокирует удар!");
    }
}
