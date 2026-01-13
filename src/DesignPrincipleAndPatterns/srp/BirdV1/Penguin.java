package DesignPrincipleAndPatterns.srp.BirdV1;

import DesignPrincipleAndPatterns.srp.BirdV0.Bird;

public class Penguin extends Bird {
    public Penguin(String name, int numberOfLegs, String type, int age) {
        super(name, numberOfLegs, type, age);
    }

    @Override
    public void makeSound() {

    }
//but the problem is here in abstarct class inheritance, penguin doesnt fly still it has to inherit it and provide
    //body for it which is wrong thats why feature/behaviour/method ke basis pe we need INTERFACE Birdv3
    @Override
    public void fly() {

    }
}
