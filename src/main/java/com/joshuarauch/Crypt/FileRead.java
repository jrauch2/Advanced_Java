package com.joshuarauch.Crypt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
    private FileInputStream in;

    public FileRead(String fileName) {
        try {
            in = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public int nextByte() {
        try {
            if (in.available() > 0) {
                return in.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public void close() {
        try {
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}