package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets you have?");
        Integer numberOfPets = sc.nextInt();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Pet> pets = new ArrayList<>();

        for (int i = 1; i < numberOfPets; i++) {
            System.out.println("What is name of pet" + i + "?");
            String nameOfPet = sc.next();
            names.add(nameOfPet);

            System.out.println("What is the type of pet" + i + "?");
            String typeOfPet = sc.next();

            if(typeOfPet.toLowerCase().equals("dog")){
                Dog dog = new Dog(String.valueOf(names));
                pets.add(dog);
            }
            if(typeOfPet.toLowerCase().equals("cat")){
                Cat cat = new Cat(String.valueOf(names));
                pets.add(cat);
            }

        }
        for (int i=0; i<pets.size(); i++){
            System.out.println(pets.get(i).getName() + " speak " + pets.get(i).speak());
        }
    }

}
