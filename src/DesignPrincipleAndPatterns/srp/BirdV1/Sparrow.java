package DesignPrincipleAndPatterns.srp.BirdV1;

import DesignPrincipleAndPatterns.srp.BirdV0.Bird;

public class Sparrow extends Bird {
    public Sparrow(String name, int numberOfLegs, String type, int age) {
        super(name, numberOfLegs, type, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow is making sound");
    }

    @Override
    public void fly() {
        System.out.println("Flying is flying");
    }
}
