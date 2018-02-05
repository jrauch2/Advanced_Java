package com.joshuarauch;

import java.util.ArrayList;

public class TestScores {
    private ArrayList<Double> testScores;
    private double maxScore = 100.0;
    private double minScore = 0.0;


    public TestScores(ArrayList<Double> testScores) throws InvalidTestScores{
        for (int i = 0; i < testScores.size(); i++) {
            if (testScores.get(i) > maxScore || testScores.get(i) < minScore) {
                throw new InvalidTestScores("Test score out of range.\nMust be between 0 and 100.\nscore at index: " + i);
            } else {
                this.testScores = testScores;
            }
        }
    }
//    public TestScores(ArrayList<Double> testScores) throws IllegalArgumentException{
//        for (double score: testScores) {
//            if (score > maxScore || score < minScore) {
//                throw new IllegalArgumentException("Test score out of range. Must be between 0 and 100.");
//            } else {
//                this.testScores = testScores;
//            }
//        }
//    }

    public double testScoresAverage() {
        double total = 0;
        for (double score : testScores) {
            total += score;
        }
        return total / testScores.size();
    }
}
