package com.joshuarauch;

/**
 * Created by mgreen14 on 12/27/17.
 * This class represents a student with a name and age.
 * @author Matt Green, Joshua Rauch
 * @version 1.0
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     *
     * @param age The age of this student.
     * @param name The name of this student.
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     *
     * @return the age of this student.
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age Set the age of this student.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return "Can we talk about my grade."
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
