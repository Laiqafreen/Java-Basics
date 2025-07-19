import java.util.Scanner;
public class Tax {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        double salary;
        System.out.println("Enter your Salary : ");
        salary = sc.nextDouble();
        double tax = 0;
        if(salary < 2.5){
            System.out.println("No tax applicable");
        }
        else if(salary >= 2.5 && salary < 5.0){
            System.out.println("5% tax applied");
            tax = 0.05 * (salary - 2.5);  
        }
        else if(salary >= 5.0 && salary <10.0){
            System.out.println("20% tax applied");
            tax = 0.05 * 2.5 + 0.20 * (salary - 5.0);
        }
        else {
            System.out.println("30% tax applied");
            tax = 0.05 * 2.5 + 0.20 * 5.0 + 0.30 * (salary - 10.0);
        }
        System.out.println("Tax to be paid "+ tax);
    }  
}
