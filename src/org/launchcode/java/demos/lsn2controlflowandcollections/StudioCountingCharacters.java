package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Scanner;

public class StudioCountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrese");
        String str = input.nextLine();
        input.close();

        //String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        CountingChar.countingChrts(str );
    }
}