package com.joshuarauch;

public final class InputTypeVerifier {

    public static int verifyInt(String s) throws Exception{

        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e){
            throw new Exception("Not an integer.");
        }
    }


}
