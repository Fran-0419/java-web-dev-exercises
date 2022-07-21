package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] arg){

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Please complete. ");
        do{
            System.out.println("Student's name :");
            name = input.nextLine();

            if(!name.equals("")){
                System.out.println("Student's ID :");
                Integer studentId = input.nextInt();
                students.put(studentId, name);
                input.nextLine();
            }
        }while (!name.equals(""));
        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("There are : " + students.size()  + " students.");
    }
}
