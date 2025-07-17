// Define a public class named Cgpa
public class Cgpa {
    public static void main(String args[]) {

        // Declare and initialize marks for three subjects
        int marks1 = 67;
        int marks2 = 78;
        int marks3 = 86;

        // Calculate the sum of all three subject marks
        int SumMarks = marks1 + marks2 + marks3;

        // Calculate the average marks
        float average = (float) SumMarks / 3;

        // Convert the average marks into CGPA (as per CBSE, CGPA = average / 9.5)
        double CGPA = (double) average / 9.5;

        // Print the CGPA to the console
        System.out.println("Cgpa using three subjects marks : " + CGPA);
    }  
}
