package org.example;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
        this.name = "Неизвестное животное";
        this.age = 0;
    }

    public void makeSound() {
        System.out.println("Издает звук");
    }

    public void eat() {
        System.out.println(name + " ест");
    }
}

