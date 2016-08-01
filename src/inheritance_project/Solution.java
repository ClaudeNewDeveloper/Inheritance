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
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob.toString());

        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne.toString());

        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000.0);
        System.out.println(mrJava.toString());

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima.toString());

    }

}
