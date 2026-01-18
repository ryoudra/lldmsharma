package DesignPrincipleAndPatterns.srp.Birdv3;

import DesignPrincipleAndPatterns.srp.BirdV0.Bird;

public class Pegion extends Bird implements Flyable {

    public Pegion(String name, int numberOfLegs, String type, int age) {
        super(name, numberOfLegs, type, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Pegion is making sound");

    }

    @Override
    public void fly() {
        System.out.println("Pegion is flying");
    }
}
