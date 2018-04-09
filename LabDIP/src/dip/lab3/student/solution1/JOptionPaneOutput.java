package dip.lab3.student.solution1;

import javax.swing.*;

public class JOptionPaneOutput implements MessageOutput {

    @Override
    public void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
