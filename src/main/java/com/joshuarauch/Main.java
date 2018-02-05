package com.joshuarauch;


import java.util.ArrayList;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    /**
     * Main method for Animals program
     * @param args arguments
     */
    public static void main(String[] args) {
        //instantiate ArrayList of Talkable objects
        ArrayList<Talkable> zoo = new ArrayList<>();
        Boolean addTalkable = true;
        // User input
        UserInput input = new UserInput(zoo);
        zoo = input.addTalkable();
        // Print ArrayList to Terminal
        for (Talkable thing: zoo) {
            printOut(thing);
        }
        //Write out ArrayList to file
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();
        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    /**
     * This method prints Talkable objects to Terminal.
     * @param p
     */
    public static void printOut(Talkable p)  {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + "|" + p.talk());
    }
}
