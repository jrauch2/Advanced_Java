package com.joshuarauch;

/**
 * This class represents a dog with a name and if it is friendly.
 * @since  1.0 12/27/17
 * @author Matt Green, Joshua Rauch
 * @version 1.0
*/
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     *
     * @param friendly Is this dog frindly? True or false.
     * @param name The name of this dog.
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     *
     * @return true or false, whether the dog is friendly or not.
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     *
     * @return "Bark".
     */
    @Override
    public String talk() {
        return "Bark";
    }

    /**
     *
     * @return "Dog: name='name' friendly='friendly'".
     */
    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}