package com.joshuarauch;

public class Main {

    private final static FileRead inFile = new FileRead("sample.txt");

    public static void main(String[] args) {
        Encrypt myKey = new Encrypt("Joshua");
        myKey.encrypt('a');
    }
}
