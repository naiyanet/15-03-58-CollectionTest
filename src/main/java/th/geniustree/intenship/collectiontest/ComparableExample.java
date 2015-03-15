package th.geniustree.intenship.collectiontest;

import java.util.TreeSet;
import java.util.*;

public class ComparableExample {

    public static void main(String[] args) {
        TreeSet studentSet = new TreeSet();
        studentSet.add(new Student("Mike", "Hauffmamn", 101, 4.0));
        studentSet.add(new Student("John", "Lynn", 102, 2.8));
        studentSet.add(new Student("Jim", "Max",103, 3.6));
        studentSet.add(new Student("Kelly", "Grant",104,2.3));
        Object[] studentArray = studentSet.toArray();
        Student s;
        for(Object obj : studentArray){
            s = (Student) obj;
            System.out.println("Name = "+s.firstName()+" "+s.lastName()+" StudentID = "+s.studentID()+" GPA = "+s.GPA());
        }
    }
}

class Student implements Comparable{
    private String firstName, lastName;
    private int studentID=0;
    private double GPA=0.0;
    public Student(String firstName, String lastName, int StudentID,double GPA) {
        if (firstName == null || lastName == null || StudentID == 0|| GPA == 0.0) {
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
    public int compareTo(Object o) {
        double f = GPA-((Student)o).GPA;
        if (f == 0.0){
            return 0;
        }else{
            if(f<0.0){
                return -1;
            }else{
                return 1;
            }
        }
            
    }
}
