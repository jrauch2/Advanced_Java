package dip.lab3.student.solution1;

public class ConsoleOutput implements MessageOutput {
    @Override
    public void outputMessage(String message) {
        System.out.println(message);
    }
}
