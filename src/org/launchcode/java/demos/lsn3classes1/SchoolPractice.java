package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student fran = new Student();
        fran.setName("Francisco");

        fran.newStudenCredit(1);
        fran.setGpa(4.0);
        fran.setStudentId(21);

        /*System.out.println(fran.getGradeLevel(fran.getNumberOfCredits()));
        System.out.println(fran.getGpa());
        fran.addGrade(4,5);
        System.out.println(fran.getGpa());
        fran.addGrade(4,6);
        System.out.println(fran.getGpa());

        Teacher myTeacher = new Teacher();

        myTeacher.setFirstName("Gerard");
        myTeacher.setLastName("Darris");
        myTeacher.teachersSubject("Java");
        myTeacher.teachersYearsTeaching(4);*/
        //System.out.println(("Teacher's name: " + myTeacher.getFirstName() +" "+ myTeacher.getLastName() + " \n"));
    }
}
