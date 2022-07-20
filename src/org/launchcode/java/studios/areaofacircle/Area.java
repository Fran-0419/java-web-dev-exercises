package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of your circle");
        Double radius = input.nextDouble();
        //input.close();
        if (radius <= 0){
            System.out.println("Please enter a positive number.");
            main (new String[]{});
        } else {
            Double theArea = Circle.getArea(radius);
            System.out.println("The area is : "+ theArea);
        }

    }
}
