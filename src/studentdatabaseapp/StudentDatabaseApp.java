package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //ask how many new user we want to add
        System.out.println("Enter no of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        //create n number of new student
        for(int n = 0; n < numOfStudents; n++)
        {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTution();
            System.out.println(students[n].toString());
        }
        for(int n = 0; n < numOfStudents; n++)
        {
            System.out.println(students[n].toString());
        }
    }
}
