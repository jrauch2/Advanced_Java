package com.joshuarauch;

/**
 * Created by mgreen14 on 12/27/17.
 * This abstract class provides every person with a name.
 * @author Matt Green, Joshua Rauch
 * @version 1.0
 */
public abstract class Person {
    private String name;

    /**
     *
     * @param name The name of this person.
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     *
     * @return  the name of this person.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name Name this person.
     */
    public void setName(String name) {
        this.name = name;
    }


}