package DesignPrincipleAndPatterns.srp.Birdv3;

import DesignPrincipleAndPatterns.srp.BirdV0.Bird;

public class Peacock extends Bird {
    public Peacock(String name, int numberOfLegs, String type, int age) {
        super(name, numberOfLegs, type, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Peacock is making sound");

    }

    @Override
    public void fly() {
        System.out.println("Peacock is flying");
    }
}
