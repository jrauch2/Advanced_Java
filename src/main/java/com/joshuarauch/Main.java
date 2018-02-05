package com.joshuarauch;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Double> testScores = new ArrayList<>();

    public static void main(String[] args) {
        testScores.add(45.8);
        testScores.add(99.9);
        testScores.add(79.36);
        testScores.add(84.66);
        testScores.add(89.96);
        testScores.add(100.1);

        try {
            TestScores test1 = new TestScores(testScores);
            System.out.println(test1.testScoresAverage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
