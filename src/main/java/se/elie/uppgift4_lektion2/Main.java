package se.elie.uppgift4_lektion2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IAnimal> animals = new ArrayList<>();

        Bird bird = new Bird();
        Dog dog = new Dog();

        animals.add(bird);
        animals.add(dog);

        for (IAnimal animal : animals) {
            animal.makeSound(); // Polymorfiskt anrop
        }

    }
}
