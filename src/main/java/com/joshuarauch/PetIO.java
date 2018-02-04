package com.joshuarauch;

import java.util.Scanner;

public class PetIO {
    public static Scanner keyboard = new Scanner(System.in);
    public PetIO() {

    }

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
                System.out.println("Invalid Animal Type.");
            }
        } while((ans != null) && (ans.toUpperCase().charAt(0) != 'C') && (ans.toUpperCase().charAt(0) != 'D'));
        return pet;
    }

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

    private Talkable createCat() {
        String name = inputName();
        String ans;
        int miceKilled=0;
        boolean miceNumeric=false;
        while (!miceNumeric) {
            System.out.println("Please enter number of mice killed:  ");
            ans = keyboard.nextLine();
            try {
                miceKilled = Integer.parseInt(ans);
                miceNumeric=true;
            } catch (NumberFormatException e) {
                System.out.println(ans
                        + " is not an integer.");
            } catch (Exception e)
            {
                System.out.println("Bad number format.");
            }
        }
        return new Cat(miceKilled, name);
    }

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
