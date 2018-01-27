package com.joshuarauch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    Dog dog0;
    /**
     * Assign value to dog0.
     */
    @Before
    public void setUp()  {
        dog0 = new Dog(true, "Pupper");
    }

    /**
     * Test if dog is friendly.
     */
    @Test
    public void testIsFriendly() {
        assertTrue("This dog is friendly", dog0.isFriendly());
    }

    /**
     * Test if dog barks.
     */
    @Test
    public void testTalk() {
        assertEquals("Dogs bark", "Bark", dog0.talk());
    }

    /**
     * test the overridden toString() method.
     */
    @Test
    public void testToString() {
        assertEquals("Dog: name=Pupper isFriendly'true", dog0.toString());
    }

    /**
     * Test the dog's name.
     */
    @Test
    public void testGetName() {
        assertEquals("This dog's name is Pupper", dog0.getName());
    }
}