package org.launchcode.java.demos.lsn2controlflowandcollections;

public class ArrayPractice {
    public static void main(String[] args){
        int myArr []  = {1, 1, 2, 3, 5, 8};
        for(int i: myArr){
            //System.out.println(i);
            if(i % 2 != 0 ){
                System.out.println(i);
            }
        }
        String myText = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String textArr[] = myText.split(" ");
        for (String tArr: textArr){
            System.out.println(tArr);
        }
    }

}
