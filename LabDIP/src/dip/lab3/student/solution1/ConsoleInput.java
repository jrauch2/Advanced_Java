package dip.lab3.student.solution1;

import java.util.Scanner;

public class ConsoleInput implements MessageInput {
    private String message = null;
    private Scanner keyboard = new Scanner(System.in);
    private final String EXCEPTION_MESSAGE = "Not a valid message. Please enter a message at least one character in length.";

    ConsoleInput() {
        String message = null;

        do {
            System.out.print("What would you like the message to say? ");
            message = keyboard.nextLine();
            if (message == null | message.length() < 1) {
                System.out.println(EXCEPTION_MESSAGE);
            }
        } while (message == null | message.length() < 1);

        setMessage(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }
}
