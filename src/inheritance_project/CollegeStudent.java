/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_project;

/**
 *
 * @author besthon1
 */
public class CollegeStudent extends Student {

    String major = null;
    int year = 0;

    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGpa, int myYear, String myMajor) {
        super(myName, myAge, myGender, myIdNum, myGpa);

        major = myMajor;
        year = myYear;
    }

    public void setMajor(String newMajor) {
        major = newMajor;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // using 'new' keyword hides the 'toString()' method of the base class Student
    @Override
    public String toString() {
        return super.toString() + ", year: " + getYear() + ", major: " + getMajor();
    }

}
