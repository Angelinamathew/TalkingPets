package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testCatConstructor(){
        Cat cat = new Cat();
        Assert.assertNotNull(cat);
    }
    @Test
    public void testCatConstructorName(){
        String expectedName = "name";
        Cat cat = new Cat(expectedName);
        String actual = cat.getName();
        Assert.assertEquals(expectedName,actual);
    }
    @Test
    public void testDogConstructorAge(){
        int expectedAge = 0;
        Cat cat = new Cat(expectedAge);

        int actual = cat.getAge();
        Assert.assertEquals(expectedAge,actual);
    }
    @Test
    public void testDogConstructorAgeName(){
        String expectedName ="name";
        int expectedAge = 0;
        Cat cat = new Cat(expectedName,expectedAge);
        Assert.assertEquals(expectedName,cat.getName());
        Assert.assertEquals(expectedAge, cat.getAge());
    }
    @Test
    public void testDogSpeak(){
        String expectedSpeak ="Meow";
        Cat cat = new Cat();
        Assert.assertEquals(expectedSpeak,cat.speak());

    }



}