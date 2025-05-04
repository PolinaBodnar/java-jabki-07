package org.example;

public class Character {
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack() {
        System.out.println("Атакую!");
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " получил " + damage + " урона. Здоровье: " + health);
    }

    // ✅ ДОБАВЬ ЭТО:
    public String getName() {
        return name;
    }
}
