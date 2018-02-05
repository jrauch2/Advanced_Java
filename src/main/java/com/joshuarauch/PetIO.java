package com.joshuarauch;

import java.util.Scanner;
/**
 * This class accepts user input to create a dog or cat.
 * @since  1.0 1/29/2018
 * @author Joshua Rauch
 * @version 1.0
 */
public class PetIO {
    public static Scanner keyboard = new Scanner(System.in);
    public PetIO() {

    }

    /**
     * This method accepts user input to create a pet.
     * @return the pet created.
     * @throws Exception
     */
    public Talkable getPet() throws Exception {
        String ans;
        Talkable pet = null;
        do {
            System.out.println("Do you want to enter a (c)at, a (d)og or e(X)it? ");
            ans = keyboard.nextLine();
            if ((ans != null) && (ans.toUpperCase().charAt(0) == 'C')) {
                pet = createCat();
            } else if (ans.toUpperCase().charAt(0) == 'D') {
                pet =  createDog();
            } else if (ans.toUpperCase().charAt(0) == 'X') {
                throw new Exception("Exit pet input.");
            } else {
                System.out.println("Invalid animal type.");
            }
        } while((ans != null) && (ans.toUpperCase().charAt(0) != 'C') && (ans.toUpperCase().charAt(0) != 'D'));
        return pet;
    }

    /**
     * This method creates a dog.
     * @return dog.
     */
    private Talkable createDog() {
        String name = inputName();
        String ans;
        boolean friendly=true;
        do {
            System.out.println("Is the dog friendly, (y)es or (n)o? ");
            ans = keyboard.nextLine();
            if ((ans != null) && ans.toUpperCase().charAt(0) == 'Y') {
                friendly = true;
            } else if ((ans != null) && ans.toUpperCase().charAt(0) == 'N') {
                friendly = false;
            }
        } while((ans != null) && (ans.toUpperCase().charAt(0) != 'Y') && (ans.toUpperCase().charAt(0) != 'N'));
        return new Dog(friendly, name);
    }

    /**
     * This method creates a cat.
     * @return cat.
     */
    private Talkable createCat() {
        String name = inputName();
        String ans;
        Talkable cat = null;

        do {
            System.out.println("Please enter number of mice killed: ");
            ans = keyboard.nextLine();
            try {
                cat = new Cat(InputTypeVerifier.verifyInt(ans), name);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (cat == null);

        return cat;
    }

    /**
     * This method sets the name of a pet.
     * @return name of pet.
     */
    private String inputName() {
        String ans;
        do {
            System.out.println("Please enter your pet's name: ");
            ans = keyboard.nextLine();
            if (ans != null && ans.length() < 1) {
                System.out.println("Pet name must be at least one character in length.");
            }
        } while((ans != null) && (ans.length() < 1));
        return ans;
    }
}
