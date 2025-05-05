package org.example;

public class Mage extends Character {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Огненный шар!");
    }

    public void heal() {
        health += 20;
        System.out.println(name + " восстановил здоровье. Текущее здоровье: " + health);
    }
}
