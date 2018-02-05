package com.joshuarauch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student;

    @Before
    public void testSetUp() throws Exception{
        student = new Student(28, "Joshua");
    }

    @Test
    public void testGetAge() {
        assertEquals("Age should be 28.", 28, student.getAge());
    }

    @Test
    public void testSetAge() {
        student.setAge(20);
        assertEquals("Age is changed to 20", 20, student.getAge());
    }

    @Test
    public void testTalk() {
        assertEquals("Can we talk about my grade.", student.talk());
    }

    @Test
    public void testGetName() {
        assertEquals("Joshua", student.getName());
    }

    @Test
    public void testSetName() {
        student.setName("Josh");
        assertEquals("Name is changed to Josh", "Josh", student.getName());
    }
}