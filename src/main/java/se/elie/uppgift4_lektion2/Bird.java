package se.elie.uppgift4_lektion2;
public class Bird implements IAnimal {

    @Override
    public void makeSound() {
        System.out.println("Tweet!");
    }
}