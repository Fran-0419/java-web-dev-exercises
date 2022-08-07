package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args){
        HouseCat testHouseCat = new HouseCat("Garfield", 12);

        /*testHouseCat.eat();
        System.out.println(testHouseCat.isTired());
        testHouseCat.sleep();
        System.out.println(testHouseCat.isTired()+"\n" + testHouseCat.noise());*/
        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());


    }
}
