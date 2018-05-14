package ch13.work.template;

import java.util.Scanner;

public class ReadFromUser extends BookReader{

    private Scanner keyboard;
    private String line;
    @Override
    void initialize() {
        keyboard = new Scanner(System.in);
    }

    @Override
    void startReading() {
        System.out.println("Please enter a story - type EOS when done.");
        String input;
        line = "";
        do {
            input = keyboard.nextLine();
            line += input + "\n";
        } while (!input.toUpperCase().equals("EOS"));
    }

    @Override
    void stopReading() {
        System.out.println(line);
    }
}
