import java.util.Scanner;
public class Mul {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n1 = sc.nextInt();
        
        int mul;
        //Multiplication table normal order.
        System.out.println("Multiplication table in normal order."); 
        for(int i=1;i<=10;i++){ 
            mul=n1*i;
            System.out.printf(" %d * %d = %d",n1,i,mul);
            System.out.println("\n");
        }
        System.out.println(" ");
        
        int mul2;
        //Multiplication table in reverse order.
        System.out.println("Multiplication table in reverse order.");
        for(int j=10;j>0;j--){
            mul2=n1*j;
            System.out.printf(" %d * %d = %d",n1,j,mul2);
            System.out.println("\n");
        }
    }

    
}
