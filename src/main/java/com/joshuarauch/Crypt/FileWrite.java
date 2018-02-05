package com.joshuarauch.Crypt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
    private FileOutputStream out;

    public FileWrite(String fileName) {
        try {
            out = new FileOutputStream(fileName, false);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    public void nextByte() {}
    public void nextByte(int charInt) {
        try {
            out.write(charInt);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void close() {
        try {
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
