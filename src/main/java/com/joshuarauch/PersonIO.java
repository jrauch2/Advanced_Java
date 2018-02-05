package com.joshuarauch;

import java.util.Scanner;
/**
 * This class accepts user input to create a Person.
 * @since  1.0 1/29/2018
 * @author Joshua Rauch
 * @version 1.0
 */
public class PersonIO {

    public static Scanner keyboard = new Scanner(System.in);
    public PersonIO() {

    }

    /**
     * This method accepts user input to create a person.
     * @return the person created.
     * @throws Exception
     */
    public Talkable getPerson() throws Exception {
        String ans;
        Talkable person = null;
        do {
            System.out.println("Do you want to enter a (s)tudent or e(x)it? ");
            ans = keyboard.nextLine();
            if ((ans != null) && (ans.toUpperCase().charAt(0) == 'S')) {
                person = createStudent();
            } else if (ans.toUpperCase().charAt(0) == 'X') {
                throw new Exception("Exit person input.");
            } else {
                System.out.println("Invalid person type.");
            }
        } while((ans != null) && (ans.toUpperCase().charAt(0) != 'S'));
        return person;
    }

    /**
     * This method creates a student.
     * @return student.
     */
    private Talkable createStudent() {
        String name = inputName();
        String ans;
        Talkable student = null;

        do {
            System.out.println("What is the student's age?: ");
            ans = keyboard.nextLine();
            try {
                student = new Student(InputTypeVerifier.verifyInt(ans), name);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (student == null);

        return student;
    }

    /**
     * This method sets the name of a person.
     * @return name of person.
     */
    private String inputName() {
        String ans;
        do {
            System.out.println("Please enter the student's name: ");
            ans = keyboard.nextLine();
            if (ans != null && ans.length() < 1) {
                System.out.println("Student name must be at least one character in length.");
            }
        } while((ans != null) && (ans.length() < 1));
        return ans;
    }
}
