package dip.lab3.student.solution1;

import javax.swing.*;

public class JOptionPaneInput implements MessageInput {

    private String message;
    private final String EXCEPTION_MESSAGE = "Not a valid message. Please enter a message at least one character in length.";

    public JOptionPaneInput() {
        message = null;

        do {
            message = JOptionPane.showInputDialog(null, "Please enter a message:");
            if (message == null | message.length() < 1) {
                message = JOptionPane.showInputDialog(null, EXCEPTION_MESSAGE);
            }
        } while (message == null | message.length() < 1);

        setMessage(message);
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;

    }
}
