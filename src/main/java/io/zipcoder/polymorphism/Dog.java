package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog() {
        super();
    }
    public Dog(String name) {
        super(name);
    }
    public Dog(int age) {
        super(age);
    }
    public Dog(String name, int age){
        super(name,age);

    }
    @Override
    public String speak(){
        return "Boow";
    }
}
