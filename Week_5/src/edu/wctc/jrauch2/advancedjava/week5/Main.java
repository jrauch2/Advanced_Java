package edu.wctc.jrauch2.advancedjava.week5;

import java.util.Scanner;

public class Main {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter your favorite NFL team's city?: ");
        String favCity = keyboard.nextLine().toUpperCase();
        Team theTeam;
        if (favCity.startsWith("CH")) {
            theTeam = Team.CHICAGO;
        } else if (favCity.startsWith("DE")) {
            theTeam = Team.DETROIT;
        } else if (favCity.startsWith("GR")) {
            theTeam = Team.GREEN_BAY;
        } else if (favCity.startsWith("MI")) {
            theTeam = Team.MINNEAPOLIS;
        } else {
            theTeam = Team.OTHER;
        }

        printMascot(theTeam);

    }

    public static void printMascot(Team team) {
        String mascot = "Cougars";

        switch(team) {
            case CHICAGO:
                mascot = "Da Bears!!!";
                break;
            case DETROIT:
                mascot = "La Lions";
                break;
            case GREEN_BAY:
                mascot = "Packers eh??";
                break;
            case MINNEAPOLIS:
                mascot = "Boooooooooo";
                break;
            default:
                mascot = "Not a real football team";
        }

        System.out.println(mascot);

    }
}
