package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void testPetConstructor(){
        String expectedName = "name";
        int expectedAge = 0;

        Pet pet = new Pet();
        Assert.assertNotNull(pet);
    }
    @Test
    public void testPetConstructorNameAge(){
        String expectedName = "name";
        int expectedAge = 0;

        Pet pet = new Pet(expectedName, expectedAge);
        Assert.assertEquals(expectedName, pet.getName());
        Assert.assertEquals(expectedAge, pet.getAge());
    }
    @Test
    public void testPetConstructorName(){
        String expectedName = "name";

        Pet pet = new Pet(expectedName);
        Assert.assertEquals(expectedName, pet.getName());
    }
    @Test
    public void testPetConstructorAge(){
        int expectedAge = 0;

        Pet pet = new Pet(expectedAge);
        Assert.assertEquals(expectedAge, pet.getAge());
    }
    @Test
    public void testPetSpeak(){
        String expectedName = "name";
        int expectedAge = 0;

        Pet pet = new Pet();
        String expectedSpeak = "woooo";
        Assert.assertEquals(expectedSpeak, pet.speak());
    }
}
