import java.util.Scanner;

// Custom exception for invalid age
class InvalidAgeException extends Exception {
  public InvalidAgeException(String message) {
    super(message);
  }
}

public class ValidateDate {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter your age: ");
      int age = scanner.nextInt();

      if (age < 18 || age > 150) {
        throw new InvalidAgeException("Age must be between 18 and 150.");
      }

      System.out.println("Valid age: " + age);

    } catch (InvalidAgeException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }
}
