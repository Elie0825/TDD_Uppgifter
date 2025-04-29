package se.elie.uppgift4_lektion2;

public class Dog implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}