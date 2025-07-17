import java.util.Scanner;
public class km {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Kilometer unit : ");
        double kUnit = sc.nextDouble();
        //Coversion km into miles.
        double miles = kUnit * 0.621371; 
        System.out.print("The conversion of Km to miles : " + miles);
    }    
}
