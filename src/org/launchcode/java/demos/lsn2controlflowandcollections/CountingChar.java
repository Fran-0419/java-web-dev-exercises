package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;

public class CountingChar {
    public static void countingChrts(String charStr){
        char[] strArr = charStr.toLowerCase().toCharArray();
        HashMap<Character, Integer> numbers = new HashMap<>();

        for(char letter : strArr ){
            if(Character.isLetter(letter)){
                if(!numbers.containsKey(letter)){
                    numbers.put(letter, 1);
                } else{
                    numbers.put(letter, (numbers.get(letter)+ 1));
                }
            }
        for(Map.Entry<Character, Integer> number : numbers.entrySet()){
            System.out.println(String.format("%s : %s", number.getKey(), number.getValue()));
        }
        }
    }
}
