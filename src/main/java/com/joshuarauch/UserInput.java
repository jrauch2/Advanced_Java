package com.joshuarauch;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public static Scanner keyboard = new Scanner(System.in);
    ArrayList<Talkable> zoo;

    public UserInput(ArrayList zoo) {
        this.zoo = zoo;
    }

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

    public void addPerson() {
//        TODO
    }

}
