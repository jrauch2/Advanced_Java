package dip.lab3.student.solution1;

public class StartUp {

    private static MessageInput consoleInput = new ConsoleInput();
    private static MessageOutput consoleOutput = new ConsoleOutput();
    private static MessageService messageService = new MessageService();
    private static MessageInput jOptionPaneInput = new JOptionPaneInput();
    private static MessageOutput jOptionPaneOutput = new JOptionPaneOutput();

    public static void main(String[] args) {
        messageService.outputMessage(consoleInput, consoleOutput);
        messageService.outputMessage(jOptionPaneInput, jOptionPaneOutput);
    }
}
