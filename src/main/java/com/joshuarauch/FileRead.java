package com.joshuarauch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    private BufferedReader in = null;
    private String fileName;


    public FileRead(String fileName) {
        this.fileName = fileName;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    public void fileRead() {
        String line;
        try {
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File Read Error: " + fileName + " " + e);
        }
    }

    public String fileReadLine() {
        try {
            return in.readLine();
        } catch (Exception e) {
            System.out.println("File Read Error: " + fileName + " " + e);
            return null;
        }
    }
    public void fileClose() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}