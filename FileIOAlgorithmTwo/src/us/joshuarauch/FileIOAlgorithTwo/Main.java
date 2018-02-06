package us.joshuarauch.FileIOAlgorithTwo;

import java.util.Scanner;

public class Main {

    private final static FileInput cardAccts = new FileInput("D:\\OneDrive - Waukesha County Technical College\\Spring 2018\\Advanced Java\\Advanced_Java\\FileIOAlgorithmTwo\\movie_cards.csv");
    private final static FileInput cardPurchases = new FileInput("D:\\OneDrive - Waukesha County Technical College\\Spring 2018\\Advanced Java\\Advanced_Java\\FileIOAlgorithmTwo\\movie_purchases.csv");
    private final static FileInput movieRatings = new FileInput("D:\\OneDrive - Waukesha County Technical College\\Spring 2018\\Advanced Java\\Advanced_Java\\FileIOAlgorithmTwo\\movie_rating.csv");

    private static Scanner keyboard = new Scanner(System.in);
    private static String line0;
    private static String line1;

    public static void main(String[] args) {
        String line;
        String[] fields;
        int[] nums = new int[2];
        double avgRating;
        boolean first = true;

        System.out.format("%8s  %-18s %6s %6s %11s\n","Account","Name", "Movies", "Points", "Avg Ratings");
        while ((line = cardAccts.fileReadLine()) != null) {
            fields = line.split(",");
            findPurchases(first, fields[0], nums);
            avgRating = findRatings(first, fields[0]);
            first = false;
            System.out.format("00%6s  %-18s  %2d   %4d %11.2f\n",fields[0],fields[1], nums[0], nums[1], avgRating);
        }
    }

    public static void findPurchases(boolean first, String acct, int[] nums) {
        nums[0] = 0;
        nums[1] = 0;
        String[] fields;
        boolean done = false;
        if (first) {
            line0 = cardPurchases.fileReadLine();
        }
        while ((line0 != null) && !(done)) {
            fields = line0.split(",");
            if (fields[0].compareTo(acct) > 0) {
                done = true;
            }
            else if (fields[0].equals(acct)) {
                nums[0]++;
                nums[1] += Integer.parseInt(fields[2]);
                line0 = cardPurchases.fileReadLine();
            }
        }
    }

    public static double findRatings(boolean first, String acct) {
        String[] fields;
        boolean done = false;
        int count = 0;
        int total = 0;
        double avgRating = 0;

        if (first) {
            line1 = movieRatings.fileReadLine();
        }
        while ((line1 != null) && !(done)) {
            fields = line1.split(",");
            if (fields[0].compareTo(acct) > 0) {
                done = true;
            }
            else if (fields[0].equals(acct)) {
                total += Integer.parseInt(fields[1]);
                count++;
                line1 = movieRatings.fileReadLine();
            }
        }
        if (count != 0) {
            avgRating = (double)total / count;
        }
        return avgRating;
    }
}