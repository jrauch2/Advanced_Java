package com.joshuarauch;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class accepts user input to create a person or a pet.
 */
public class UserInput {
    public static Scanner keyboard = new Scanner(System.in);
    ArrayList<Talkable> zoo;

    public UserInput(ArrayList zoo) {
        this.zoo = zoo;
    }

    /**
     * This method asks a user if they want to add a person or pet.
     * @return ArrayList of Talkable objects.
     */
    public ArrayList addTalkable() {
        String ans;
        boolean wantAddTalkable = true;
        do {
            System.out.println("Would you like to add a (p)et, a p(e)rson, or e(x)it?");
            ans = keyboard.nextLine();
            if ((ans != null) && (ans.toUpperCase().charAt(0) == 'P')) {
                addPet();
            } else if (ans.toUpperCase().charAt(0) == 'E') {
                addPerson();
            } else if (ans.toUpperCase().charAt(0) == 'X') {
                wantAddTalkable = false;
            } else {
                System.out.println("Not a valid input");
            }

        } while (wantAddTalkable);

        return zoo;
    }

    /**
     * This method adds a pet.
     */
    public void addPet() {
        boolean wantAddPet = true;
        PetIO input = new PetIO();
        do {
            try {
                zoo.add(input.getPet());
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
                wantAddPet=false;
            }
        } while(wantAddPet);
    }

    /**
     * This method adds a person.
     */
    public void addPerson() {
        boolean wantAddPerson = true;
        PersonIO input = new PersonIO();
        do {
            try {
                zoo.add(input.getPerson());
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
                wantAddPerson=false;
            }
        } while(wantAddPerson);
    }
}
