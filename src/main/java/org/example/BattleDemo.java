package org.example;

public class BattleDemo {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Воин", 100);
        Mage mage = new Mage("Маг", 80);

        warrior.attack();
        mage.takeDamage(15);

        mage.attack();
        warrior.takeDamage(20);

        mage.heal();
        warrior.block();
    }
}
