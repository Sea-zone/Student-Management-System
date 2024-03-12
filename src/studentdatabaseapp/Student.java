package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentId;
    private String courses = " ";
    private int tuitionBalance = 0;

    private static int costOfCourse = 600;
    private static int id = 1000;

    //constructor: prompt user to enter students name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student first name: ");
        this.lastName = in.nextLine();

        System.out.print("1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior \nEnter student class level: ");
        this.gradeYear = in.nextLine();
        setStudentId();
    }


    //Generate an ID
    private void  setStudentId() {
        //grade level + id
        id++;
        this.studentId = gradeYear +""+ id;
    }

    //Enroll in courses
    public void enroll(){
        //get inside a loop, user hits 0
        do {
            System.out.print("\nEnter course to enroll (Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else
            {
                break;
            }
        }while (1 != 0);
    }

    //View Balance
    public void viewBalance(){
        System.out.println("Your balance is: $" +tuitionBalance);
    }
    //Pay Tution
    public void payTution(){
        viewBalance();
        System.out.println("Enter your payment:$");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }


    //show status
    public String toString(){
        return "Name: "+firstName+" " + lastName+
                "\nGrade level: "+gradeYear+
                "\nStudent ID: "+ studentId+
                "\nCourses Enrolled: "+ courses+
                "\nBalance:$" + tuitionBalance;
    }
}
