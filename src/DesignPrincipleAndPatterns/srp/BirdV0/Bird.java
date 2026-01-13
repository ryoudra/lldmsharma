package DesignPrincipleAndPatterns.srp.BirdV0;


//interfaces can only be implemented and not extended and interfaces will not have data members
//the interface are more about method behaviour oriented
//while classes abstract classes are entity oriented

public abstract class Bird {
    private String name;
    private int age;
    private String type;
    private int numberOfLegs;

    public abstract void makeSound();
    public abstract void fly();
    public  void eat(){
        System.out.println("bird is eating");
    }

    public Bird(String name, int numberOfLegs, String type, int age) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
