import java.util.Scanner;
public class Leap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter a year: ");
        year = sc.nextInt();
        if(year%400==0 || year%4==0 && year%100!=0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a Leap year");
        }
    }
    
}
