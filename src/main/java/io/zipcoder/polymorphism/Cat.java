package io.zipcoder.polymorphism;

public class Cat extends Pet{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(int age) {
        super(age);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
