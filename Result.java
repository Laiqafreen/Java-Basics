import java.util.Scanner;
public class Result {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your English marks : ");
        int marks1 = sc.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        int marks2 = sc.nextInt();
        System.out.println("Enter your English marks : ");
        int marks3 = sc.nextInt();
        int sum = marks1 + marks2 + marks3;
        float percentage = (float) sum / 3 ;
        System.out.println("Your Percentage : "+ percentage);
        if(percentage > 40 )
        {
            System.out.println("You are passed");
        } 
        else if (percentage >= 33)
        {
            System.out.println("You are promoted");
        } 
        else
        {
            System.out.println("You are fail");
        }
    }
    
}
