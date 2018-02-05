package com.joshuarauch;

/**
 * This class is a static class that verifies input type.
 */
public final class InputTypeVerifier {
    /**
     * This static method verifies that the input type is int
     * @param s string passed in for verification
     * @return int
     * @throws Exception "Not an integer.
     */
    public static int verifyInt(String s) throws Exception{

        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e){
            throw new Exception("Not an integer.");
        }
    }


}
