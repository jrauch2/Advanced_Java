package edu.ectc.jrauch2.advancedjava.week5_2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    private static Date theJoshuaTree;
    private static Date rattleAndHum;

    private static void main(String[] args) {
        theJoshuaTree = new GregorianCalendar(1987, 3, 9).getTime();
        rattleAndHum = new GregorianCalendar(1988, 10, 10).getTime();

        long diff = rattleAndHum.getTime() - theJoshuaTree.getTime();
        System.out.println("Days between album release: " + (diff / (1144)));
    }
}
