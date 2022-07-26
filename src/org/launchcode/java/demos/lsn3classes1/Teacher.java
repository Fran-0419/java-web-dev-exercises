package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;


    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getSubject(){
        return this.subject;
    }

    public int getYearsTeaching(){
        return this.yearsTeaching;
    }

    public void setFirstName(String aFirstName){
        this.firstName = aFirstName;
    }

    public void setLastName(String aLastName){
        this.lastName = aLastName;
    }

    private void setSubject( String aSubject){
        this.subject = aSubject;
    }

    private void setYearsTeaching( int aYearsTeaching ){
        this.yearsTeaching = aYearsTeaching;
    }

    public void teachersSubject(String teachersSubject){
        this.setSubject(teachersSubject);
    }

    public void teachersYearsTeaching(int years){
        this.setYearsTeaching(years);
    }

    public void teachersInfo(){
        System.out.println("Teacher's name: " + this.firstName +" "+ this.lastName+ " \n");
        System.out.println("Subject: " + this.subject);
        System.out.println("Years teaching: "+ this.yearsTeaching);
    }

}
