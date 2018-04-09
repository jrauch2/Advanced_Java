package dip.lab3.student.solution1;

import javax.swing.*;

public class JOptionPaneInput implements MessageInput {

    private String message = null;

    public JOptionPaneInput() {
        message = JOptionPane.showInputDialog(null, "Please enter a message:");
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
