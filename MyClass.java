import java.util.Scanner;  // Import the Scanner class

public class MyClass {
  public static void main(String[] args) {
    int x, y, sum;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("number1:");
    x = myObj.nextInt(); // Read user input

    System.out.println("number2:");
    y = myObj.nextInt(); // Read user input

    sum = x + y;
    System.out.println("Sum is: " + sum); // Output user input
  }
} 
