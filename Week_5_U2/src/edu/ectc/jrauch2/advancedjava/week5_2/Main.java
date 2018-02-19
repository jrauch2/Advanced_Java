package edu.ectc.jrauch2.advancedjava.week5_2;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    private static Date theJoshuaTree;
    private static Date rattleAndHum;

    public static void main(String[] args) {
        theJoshuaTree = new GregorianCalendar(1987, 3, 9).getTime();
        rattleAndHum = new GregorianCalendar(1988, 10, 10).getTime();

        long diff = rattleAndHum.getTime() - theJoshuaTree.getTime();
        System.out.println("Days between album release: " + (diff / (1000 * 60 * 60 * 24)));

        Date future = new Date(new Date().getTime() + diff);
        DateFormat dateFormatter;
        dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT);
        System.out.println("Date of \"Rattle and Hum\": " + dateFormatter.format(future));

    }
}
