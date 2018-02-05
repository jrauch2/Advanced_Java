package com.joshuarauch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputTypeVerifierTest {
    Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student(28, "Joshua");
    }

    @Test
    public void verifyInt() {
        try {
            assertNotEquals(student.getAge(), InputTypeVerifier.verifyInt("a"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}