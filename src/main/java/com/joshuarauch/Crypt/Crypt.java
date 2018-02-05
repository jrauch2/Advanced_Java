package com.joshuarauch.Crypt;

public final class Crypt {

    public static int crypt(int charInt, int key) {
        return charInt ^ key;
    }
}
