package com.joshuarauch.Crypt;

public final class Crypt {

    public static int encrypt(int charInt, int key) {
        return charInt ^ key;
    }
}
