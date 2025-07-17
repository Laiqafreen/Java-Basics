// Import the Scanner class to take input from the user
import java.util.Scanner;

public class Msg {
    public static void main(String args[]) {
        // Create a Scanner object for reading user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.print("Enter your name: ");
        
        // Read the full name entered by the user
        String name = sc.nextLine();

        // Print a personalized greeting message
        System.out.print("Hello, " + name + ". Have a great day!");
    }
}

