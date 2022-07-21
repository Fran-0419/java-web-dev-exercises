package org.launchcode.java.demos.lsn2controlflowandcollections;
import java.util.ArrayList;

public class ArrayLPract {
    public static int evenNum(ArrayList<Integer> theArray){
        int result = 0;
        for(int i : theArray){
            if(i % 2 == 0){
                result += i;
            }
        }
        return result;
    }
}
