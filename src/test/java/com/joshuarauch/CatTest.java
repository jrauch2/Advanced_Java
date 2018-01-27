package com.joshuarauch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    Cat cat0;

    /**
     * Assign value to cat0.
     */
    @Before
    public void setUp() {
        cat0 = new Cat(10, "Kitty");
    }

    /**
     * Verify that getMousesKilled returns the correct amount.
     */
    @Test
    public void testGetMousesKilled() {
        assertEquals("Cat0 should have killed 10 mouses.", 10, cat0.getMousesKilled());
    }

    /**
     * Verify that addMouse() increases mousesKilled by 1.
     */
    @Test
    public void testAddMouse() {
        cat0.addMouse();
        assertEquals("After calling addMouse(), mousesKilled should equal 11.", 11, cat0.getMousesKilled());
    }

    @Test
    public void testTalk() {
        assertEquals("Cats say 'Meow'","Meow", cat0.talk());
    }

    @Test
    public void testToString() {
        assertEquals("Cat: name=Kitty mousesKilled=10", cat0.toString());
    }

    @Test
    public void testGetName() {
        assertEquals("The cat's name should be Kitty", "Kitty", cat0.getName());
    }
}