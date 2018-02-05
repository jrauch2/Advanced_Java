package com.joshuarauch.Crypt;

public class Main {

    public static void main(String[] args) {


    }

    public void encrypt() {
        FileRead inFile = new FileRead("sample.txt");
        FileWrite outFile = new FileWrite("sample.encrypted.txt");
        FileWrite keyOut = new FileWrite("key.txt");
        int readByte;

        do {
            readByte = inFile.nextByte();
            int key = Key.keyGen();
            keyOut.nextByte(key);
            outFile.nextByte(Crypt.encrypt(readByte, key));
        } while (readByte > -1);
        outFile.close();
        keyOut.close();
    }

    public void decrypt() {
        FileRead inFile = new FileRead("sample.encrypted.txt");
        FileWrite outFile = new FileWrite("sample.decrypted.txt");
        FileRead keyIn = new FileRead("key.txt");
        int readByte;
        do {
            readByte = inFile.nextByte();
            int key = keyIn.nextByte();
            outFile.nextByte(Crypt.encrypt(readByte, key));
        } while (readByte > -1);
    }
}
