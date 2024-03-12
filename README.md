# Student-Management-System

This repository contains a simple Java application named StudentDatabaseApp that allows users to manage student information, enroll in courses, view balances, pay tuition, and display student status.

**#Usage**

To use the application, follow these steps:

1)Clone the repository to your local machine:
git clone https://github.com/your-username/studentdatabaseapp.git

2)Navigate to the project directory:
cd studentdatabaseapp

3)Compile the Java files:
javac StudentDatabaseApp.java

4)Run the application:
java StudentDatabaseApp


#**Functionality**

Student Class
The Student class encapsulates the basic information and actions related to a student:

Attributes:
firstName: First name of the student.
lastName: Last name of the student.
gradeYear: Grade level of the student.
studentId: Unique identifier for the student.
courses: Courses in which the student is enrolled.
tuitionBalance: Current tuition balance for the student.

Static Attributes:
costOfCourse: Cost of each course.
id: Static variable used to generate unique student IDs.

Methods:
Student(): Constructor that prompts the user to enter the student's name and grade level.
setStudentId(): Generates a unique student ID based on the grade level and static ID variable.
enroll(): Allows the student to enroll in courses until the user chooses to quit.
viewBalance(): Displays the current tuition balance for the student.
payTuition(): Allows the student to make payments towards their tuition balance.
toString(): Returns a string representation of the student's information.
