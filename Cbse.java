// Importing the Scanner class from java.util package to take user input
import java.util.Scanner;

public class Cbse {
    public static void main(String args[]) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter marks for English
        System.out.println("Enter English marks : ");
        int mark1 = sc.nextInt();

        // Prompting user to enter marks for Mathematics
        System.out.println("Enter Mathematics marks : ");
        int mark2 = sc.nextInt();

        // Prompting user to enter marks for Hindi Science (this label may be incorrect, possibly should be "Science" or "Hindi")
        System.out.println("Enter Hindi Science : ");
        int mark3 = sc.nextInt();

        // Prompting user to enter marks for Social Studies
        System.out.println("Enter Social Studies : ");
        int mark4 = sc.nextInt();

        // Prompting user to enter marks for Computer Application
        System.out.println("Enter Computer Application marks : ");
        int mark5 = sc.nextInt();

        // Calculating the sum of all subject marks
        int sum = mark1 + mark2 + mark3 + mark4 + mark5;

        // Calculating the percentage by dividing the sum by total number of subjects
        float percentage = (float)sum / 5;

        // Printing the calculated percentage
        System.out.println("Percentage: " + percentage);
    }
}
