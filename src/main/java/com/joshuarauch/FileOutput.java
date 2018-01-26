package com.joshuarauch;

import java.io.*;

/**
 * Created by mgreen14 on 12/27/17.
 * This class outputs to a file.
 * @author Matt Green, Joshua Rauch
 * @version 1.0
 */
public class FileOutput {

    Writer out = null;
    private String fileName;

    /**
     *
     * @param fileName The name of the to write to.
     */
    public FileOutput(String fileName) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
    }

    /**
     *
     * @param line The string to write on a line in the file.
     */
    public void fileWrite(String line) {
        try {
            out.write(line+"\n");
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
    }

    /**
     * Close the file.
     */
    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}