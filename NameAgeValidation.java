package Tasks;
import java.util.Scanner;

//Custom Exception for Invalid Input
class InvalidInputException extends Exception {
 public InvalidInputException(String message) {
     super(message);
 }
}

public class NameAgeValidation {
 // Method to validate name
 static void validateName(String name) throws InvalidInputException {
     if (!name.matches("[a-zA-Z]+")) {  // Only alphabets allowed
         throw new InvalidInputException("Invalid Name! Name must contain only characters.");
     }
 }

 // Method to validate age
 static void validateAge(String age) throws InvalidInputException {
     if (!age.matches("\\d+")) {  // Only digits allowed
         throw new InvalidInputException("Invalid Age! Age must contain only numbers.");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         // Input Name
         System.out.print("Enter Name: ");
         String name = sc.nextLine();
         validateName(name);

         // Input Age
         System.out.print("Enter Age: ");
         String age = sc.nextLine();
         validateAge(age);

         // If everything is valid
         System.out.println("Valid Input ✅");
         System.out.println("Name: " + name + ", Age: " + age);

     } catch (InvalidInputException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}
