package com.joshuarauch.Crypt;

public final class Key {
    public static int keyGen() {
        return (int) (Math.random() * (256));
    }
}
