package com.joshuarauch;

/**
 * This abstract class provides every pet with a name.
 * @since  1.0 12/27/17
 * @author Matt Green, Joshua Rauch
 * @version 1.0
 */
public abstract class Pet {
    protected String name;

    /**
     * \
     * @param name The name of this pet.
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     *
     * @return the name of this pet.
     */
    public String getName() {
        return name;
    }


}