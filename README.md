# **Class Trace: Mark Every Moment**
## **Attendance Management System**

### **I. Project Overview**

  The Class Trace: Mark Every Moment system automates the monitoring of student attendance in educational institutions. This system replaces the time-consuming and error-prone work of manually tracking attendance, providing an efficient and accurate alternative for administrators and educators. By providing a digital attendance system, the software improves data management and assists educators in keeping accurate student records. The program's key features include automated attendance monitoring, which allows users to indicate attendance in just a few clicks to eliminate human mistakes, and it is built for simple use, even for individuals with less technical skills, providing accessibility for instructors and administrative personnel. This project is an attendance management system that will help administrators and educators handle student attendance data more effectively. 

### **II. Object-Oriented Principles**

  Class Trace: Mark Every Moment utilized key Object-Oriented Programming (OOP) principles, including encapsulation, abstraction, inheritance, and polymorphism. Below is a detailed explanation of how each principle was executed in the system:

In using **Encapsulation**,
  Person and Student classes include data such as the student's name, ID, and attendance status. By making certain attributes private and providing public methods (getters and setters) for interacting with them, the system assures that users may only access and change the data in controlled methods. This control over data access protects the system's integrity. For instance, the methods getName(), setId(), and isPresent() provide secure data access and modification, guaranteeing that only valid actions are done on the student's information.

In using **Abstraction**,
  The Person class is an abstract class that defines similar attributes such as name and ID, which are shared by subclasses. The abstract function showDetails() is defined in Person, but its implementation is left to subclasses such as Student. This enables the system to give a high-level interface for dealing with users while hiding the specifics of its implementation in subclasses.

In using **Inheritance**,
  The Student class inherits from the Person class, allowing it to use the common functions for managing a person's name and ID. By extending Person, the Student class avoids having to re-implement these features, which promotes code reuse and reduces repetition. Instead, it may concentrate on student-specific behavior, such as tracking attendance or displaying student information, making the code more manageable and extendable.

In using **Polymorphism**,
  Polymorphism is illustrated by overriding the showDetails() function. Although showDetails() is declared in the Person class, its implementation differs by subclass. This allows the system to handle different users equally while performing their unique showDetails() function at runtime. This flexibility improves the system's scalability by allowing for the addition of new sorts of users without modifying the present code.

### **III. Sustainable Development Goal**
Class Trace supports the educational sector's goals of improving efficiency and accessibility in school management. It is aligned with the United Nations’ Sustainable Development Goal (SDG) 4, which emphasizes ensuring inclusive and equitable Quality Education. By automating attendance management, the program helps teachers focus more on engaging with students, fostering a more efficient and supportive learning environment. This contributes to the development of education systems that are both sustainable and accountable. The project aligns with SDG 4: Quality Education, as it addresses the need for effective tools to manage student data, particularly attendance, by providing a straightforward system for teachers to track attendance, thus improving educational organization and efficiency, promoting inclusivity by ensuring no student is left behind, and enabling timely interventions, all of which directly support SDG 4's goal of ensuring inclusive, equitable quality education and promoting lifelong learning opportunities for all.

### **IV.Instructions for running the program**

The program will display a menu with the following options:
1. Add Student: Add a student to the system by entering their name and ID.
2. Mark Attendance: Mark whether a student is present or absent.
3. View Attendance: View the attendance records of all students.
4. Show Totals: View the total number of students present and absent.
5. Exit: Exit the program.
   
Duplicate Student ID: The system prevent and show error message when a user added an already existing ID.
Invalid Input for Mark Attendance: The system shows an error when you input other word other than “Yes” or “No” when marking the attendance.
Exit: Ensure the program exits when the user selects option 5.
