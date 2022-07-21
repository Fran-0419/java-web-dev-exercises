package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLPract2 {
    public static String WorldLength(String theArray){

        String[] nextArr = theArray.split(" ");
        ArrayList<String> arrLst = new ArrayList<>(Arrays.asList(nextArr));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for(String j : arrLst ){
            if(j.length() == numChars ){
                System.out.println(j);
            }
        }
        return "";
    }
}
