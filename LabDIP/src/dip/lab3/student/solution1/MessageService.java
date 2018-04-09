package dip.lab3.student.solution1;

public class MessageService {

    public void outputMessage(MessageInput messageInput, MessageOutput messageOutput) {
        messageOutput.outputMessage(messageInput.getMessage());
    }
}
