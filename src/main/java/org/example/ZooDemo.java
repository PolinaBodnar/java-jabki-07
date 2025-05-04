package org.example;

import java.util.List;
import java.util.ArrayList;

public class ZooDemo {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Lion("Лев", 5));
        zoo.add(new Parrot("Кеша", 2));

        for (Animal animal : zoo) {
            animal.makeSound();
        }
    }
}
