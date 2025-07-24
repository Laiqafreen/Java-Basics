import java.util.Scanner;
public class Number {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        //check user input is integer or not by scanner class method
        if(sc.hasNextInt()){  //returns boolean value
            int number = sc.nextInt();
            System.out.println("You Entered an Integer");
        }else{
            System.out.println("Not an Integer");
        }  
    }
}
