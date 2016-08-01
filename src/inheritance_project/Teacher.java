package inheritance_project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author besthon1
 */
public class Teacher extends Person {

    String subject = null;
    double salary = 0.0;

    //constructor
    public Teacher(String myName, int myAge, String myGender, String mySubject, double mySalary) {
        super(myName, myAge, myGender);

        this.subject = mySubject;
        this.salary = mySalary;
    }

    public void setSubject(String newSubject) {
        subject = newSubject;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // using 'new' keyword hides  'toString()' method of the base class Person
    @Override
    public String toString() {
        return super.toString() + ", subject: " + getSubject() + ", salary: " + getSalary();

    }

}
