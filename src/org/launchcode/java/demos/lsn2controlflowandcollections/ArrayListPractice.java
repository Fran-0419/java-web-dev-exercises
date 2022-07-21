package org.launchcode.java.demos.lsn2controlflowandcollections;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] arg){
    ArrayList<Integer> myNun = new ArrayList<Integer>();
        myNun.add(2);
        myNun.add(3);
        myNun.add(6);
        myNun.add(8);
        myNun.add(4);
        myNun.add(5);
        myNun.add(34);
        myNun.add(5);
        myNun.add(52);
        myNun.add(37);
        myNun.add(26);
        myNun.add(43);
        myNun.add(30);
        int x = ArrayLPract.evenNum(myNun);
        System.out.println(x);

        String myText = "Java is easy to learn. Java was designed to be easy to use and is therefore easy to write, compile, debug, and learn than other programming languages. Java is object-oriented. This allows you to create modular programs and reusable code.";

        ArrayLPract2.WorldLength(myText);
    }
}
