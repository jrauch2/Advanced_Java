package ch13.work.template;

import ch13.work.FileIO.FileInput;

public class ReadFromFile extends BookReader{

    FileInput input;
    String line;

    @Override
    void initialize() {
//        System.out.println("Open an input file");
        input = new FileInput("D:\\OneDrive - Waukesha County Technical College\\Spring 2018\\Advanced Java\\Advanced_Java\\chapter13\\src\\ch13\\work\\template\\prideprejudice");
    }

    @Override
    void startReading() {
//        System.out.println("Loop writing out each record");
        input.fileReadToTreminal();
    }


    @Override
    void stopReading() {
//        System.out.println("Close input file");
        input.fileClose();
    }
}
