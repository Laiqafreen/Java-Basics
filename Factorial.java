import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        
        //FACTORIAL OF A NUMBER.
        //using for loop.
        int fact1 = 1;
        for(int i=n;i>0;i--){
            fact1 = fact1*i;
        }
        System.out.println("Factorial of number using for loop: "+ fact1);
        
        //Using while loop.
        int fact2 = 1;
        while(n!=0){
            fact2 = fact2*n;
            n--;
        }
        System.out.println("Factorial of number using while loop : "+ fact2); 
    }
}
