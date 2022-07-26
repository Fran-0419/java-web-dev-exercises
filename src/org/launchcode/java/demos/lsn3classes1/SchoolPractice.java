package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student fran = new Student();
        fran.setName("Francisco");

        fran.newStudenCredit(1);
        fran.setGpa(4.0);
        fran.setStudentId(21);

        Teacher myTeacher = new Teacher();

        myTeacher.setFirstName("Gerard");
        myTeacher.setLastName("Darris");
        myTeacher.teachersSubject("Java");
        myTeacher.teachersYearsTeaching(4);
        //System.out.println(fran.getNumberOfCredits());
        System.out.println(("Teacher's name: " + myTeacher.getFirstName() +" "+ myTeacher.getLastName() + " \n"));
    }
}
