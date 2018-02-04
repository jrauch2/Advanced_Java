package com.joshuarauch;

public class InputTypeVerifier {
    String userInput;
    int userInputInt;

    public InputTypeVerifier(String string) {
        this.userInput = string;
    }

    public int verifyInt() throws Exception{
        try {
            userInputInt = Integer.parseInt(userInput);
        } catch (NumberFormatException e){
            throw new Exception("Not an int");
        } finally {
            return userInputInt;
        }

    }


}
