package com.joshuarauch.Crypt;

import java.util.Scanner;

public class Main {

    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Main main1 = new Main();
        main1.encrypt();
        main1.decrypt();

    }

    private void encrypt() {
        FileRead inFile = new FileRead("sample.txt");
        FileWrite outFile = new FileWrite("sample.encrypted.txt");
        FileWrite keyOut = new FileWrite("key.txt");
        int readByte;

        do {
            readByte = inFile.nextByte();
            int key = Key.keyGen();
            if (readByte == -1)
                break;
            keyOut.nextByte(key);
            outFile.nextByte(Crypt.crypt(readByte, key));
        } while (true);
        outFile.close();
        keyOut.close();
    }

    private void decrypt() {
        FileRead inFile = new FileRead("sample.encrypted.txt");
        FileWrite outFile = new FileWrite("sample.decrypted.txt");
        FileRead keyIn = new FileRead("key.txt");
        int readByte;
        do {
            readByte = inFile.nextByte();
            int key = keyIn.nextByte();
            if (readByte == -1)
                break;
            int decodedInt = Crypt.crypt(readByte, key);
            outFile.nextByte(decodedInt);
            System.out.print((char)decodedInt);
        } while (true);
    }
}
