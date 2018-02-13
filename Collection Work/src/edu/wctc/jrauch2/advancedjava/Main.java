package edu.wctc.jrauch2.advancedjava;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private final static FileInput indata = new FileInput("D:\\OneDrive - Waukesha County Technical College\\Spring 2018\\Advanced Java\\Week 4\\Collection Work\\the_book.csv");
    private final static Map<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) {
        String line;
        String[] words;
        Object wordFound;
        int wordsUsedOnce = 0;
        int maxInt = 0;
        String maxString = "null";
     //   String[] fields;

        while ((line = indata.fileReadLine()) != null) {
            line=line.replace(",","").replace(".","")
                    .replace(";","").replace(":","")
                    .replace("'","").replace("\"","")
                    .replace("-","").replace("!","")
                    .replace("#","").replace("(","")
                    .replace(")","").replace("?","")
                    .replace("_","").replace("?","")
                    .toLowerCase().trim();
            words = line.split(" ");
            for (String s:words) {
                wordFound = map.get(s);
                if (wordFound == null) {
                    map.put(s, new Integer(1));
                }
                else {
                    map.put(s, map.get(s) + 1);
                }

            }

//            for (Map.Entry<String, Integer> entry : map.entrySet()) {
//                System.out.println(entry.getKey() + " " + entry.getValue());
//            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxInt) {
                    maxString = entry.getKey();
                    maxInt = entry.getValue();
                }
                if (entry.getValue() == 1)
                    wordsUsedOnce++;
            }
        System.out.println("Most used word: \"" + maxString + "\" - " + maxInt);
        System.out.println("Words used once: " + wordsUsedOnce);
    }
}