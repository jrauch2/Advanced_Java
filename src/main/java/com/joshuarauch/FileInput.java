package com.joshuarauch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class reads a file.
 * @since  1.0 12/27/17
 * @author Matt Green, Joshua Rauch
 * @version 1.1
 */
public class FileInput {

    private BufferedReader in = null;
    private String fileName;

    /**
     *
     * @param fileName The name of the file to be read.
     */
    public FileInput(String fileName) {
        this.fileName = fileName;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    /**
     * Read the next line from the file, then print the line to the terminal.
     */
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

    /**
     * Read the next line from the file.
     * @return the line.
     */
    public String fileReadLine() {
        try {
            return in.readLine();
        } catch (Exception e) {
            System.out.println("File Read Error: " + fileName + " " + e);
            return null;
        }
    }

    /**
     * If the file is open, try to close it.
     */
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