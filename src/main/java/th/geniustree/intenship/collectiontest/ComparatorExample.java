/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intenship.collectiontest;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.*;
/**
 *
 * @author User
 */
public class ComparatorExample {

    public static void main(String[] args) {
        Comparator c = new NameComp();
        TreeSet studentSet = new TreeSet(c);
        studentSet.add(new Student("Mike", "Hauffmamn",101,4.0));
        studentSet.add(new Student("John", "Lynn",102,2.8 ));
        studentSet.add(new Student("Jim", "Max",103, 3.6));
        studentSet.add(new Student("Kelly", "Grant",104,2.3));
        Object[] studentArray = studentSet.toArray();
        Students s;
        for (Object obj : studentArray) {
            s = (Students) obj;
            System.out.println("Name = " + s.firstName() + " " + s.lastName() + " StudentID = " + s.studentID() + " GPA = " + s.GPA());
        }

    }

    class NameComp implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            return (((Students) o1).firstName.compareTo(((Students) o2).firstName));
        }
    }

    class GradeComp implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            if (((Students) o1).GPA == ((Students) o2).GPA) {
                return 0;
            } else {
                if (((Students) o1).GPA < ((Students) o2).GPA) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }

    class Students {

        private String firstName, lastName;
        private int studentID = 0;
        private double GPA = 0.0;

        public Students(String firstName, String lastName, int StudentID, double GPA) {
            if (firstName == null || lastName == null || StudentID == 0 || GPA == 0.0) {
                throw new IllegalArgumentException();
            }
            this.firstName = firstName;
            this.lastName = lastName;
            this.studentID = studentID;
            this.GPA = GPA;
        }

        public String firstName() {
            return firstName;
        }

        public String lastName() {
            return lastName;
        }

        public int studentID() {
            return studentID;
        }

        public double GPA() {
            return GPA;
        }
}
