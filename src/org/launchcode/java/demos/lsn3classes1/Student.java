package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName() {
        return this.name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int astudentId) {
        this.studentId = astudentId;
    }

    private void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    public void setGpa(double aGpa) {
        this.gpa = aGpa;
    }

    public void newStudenCredit(int StudenCredit) {
        this.setNumberOfCredits(StudenCredit);
    }
    public static String getGradeLevel(int credits) {
        if (credits <= 29){
            return "Freshman";
        } else if (credits <= 59){
            return "Sophomore";
        } else if (credits <= 89) {
            return "Junior";
        } else {
            return "Senior";
        }
    }
    public void addGrade(int courseCredits, double grade ){
        double totalQScore = this.gpa* this.numberOfCredits;
        totalQScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQScore/this.numberOfCredits;
    }
    @Override
    public String toString() {
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return studentId == student.studentId && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }
}