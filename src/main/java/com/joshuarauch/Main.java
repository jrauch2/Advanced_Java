package com.joshuarauch;

public class Main {

    public static void main(String[] args) {
        Encrypt myKey = new Encrypt("Joshua");
        myKey.encrypt('a');
    }
}
