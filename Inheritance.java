package Tasks;
import java.util.Scanner;

//Parent class
class Employee {
 String name;
 int id;

 // Parent constructor
 Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Method in parent class
 void showDetails() {
     System.out.println("Employee Name: " + name);
     System.out.println("Employee ID: " + id);
 }
}

//Child class
class Manager extends Employee {
 String department;

 // Child constructor using super()
 Manager(String name, int id, String department) {
     super(name, id);  // calls parent constructor
     this.department = department;
 }

 // Method in child class
 void showManagerDetails() {
     // inherited method
     showDetails();
     // child’s own field
     System.out.println("Department: " + department);
 }
}

//Main class
public class Inheritance{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Taking user input
     System.out.print("Enter Employee Name: ");
     String name = sc.nextLine();

     System.out.print("Enter Employee ID: ");
     int id = sc.nextInt();
     sc.nextLine(); // consume newline

     System.out.print("Enter Department: ");
     String dept = sc.nextLine();

     // Create Manager object with user input
     Manager m1 = new Manager(name, id, dept);

     // Call child’s method (which also uses parent’s method)
     System.out.println("\n--- Manager Details ---");
     m1.showManagerDetails();

    
 }
}
