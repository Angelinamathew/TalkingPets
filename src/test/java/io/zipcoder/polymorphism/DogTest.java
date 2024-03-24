package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testDogConstructor(){
        Dog dog = new Dog();
        Assert.assertNotNull(dog);
    }
    @Test
    public void testDogConstructorName(){
        String expectedName = "name";
        Dog dog = new Dog(expectedName);
        String actual = dog.getName();
        Assert.assertEquals(expectedName,actual);
    }
    @Test
    public void testDogConstructorAge(){
        int expectedAge = 0;
        Dog dog = new Dog(expectedAge);

        int actual = dog.getAge();
        Assert.assertEquals(expectedAge,actual);
    }
    @Test
    public void testDogConstructorAgeName(){
        String expectedName ="name";
        int expectedAge = 0;
        Dog dog = new Dog(expectedName,expectedAge);
        Assert.assertEquals(expectedName,dog.getName());
        Assert.assertEquals(expectedAge, dog.getAge());
    }
    @Test
    public void testDogSpeak(){
        String expectedSpeak ="Bow wow";
        Dog dog = new Dog(expectedSpeak);
        Assert.assertEquals(expectedSpeak,dog.speak());

    }



}