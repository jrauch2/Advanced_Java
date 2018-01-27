package com.joshuarauch;

/**
 * This class represents a cat with a name and number of mouses killed.
 * @since  1.0 12/27/17
 * @author Matt Green, Joshua Rauch
 * @version 1.0
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     *
     * @param mousesKilled The number of mouses this cat has killed.
     * @param name The name of this cat.
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     *
     * @return the number of Mouses killed.
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * Add 1 to the number of mouses killed.
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     *
     * @return "Meow".
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     *
     * @return Returns "Cat: name='name' mousesKilled='mousesKilled'".
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

