import java.util.Scanner;
public class Expression {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of v : ");
        int v = sc.nextInt();
        System.out.println("Enter value of u : ");
        int u = sc.nextInt();
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of s : ");
        int s = sc.nextInt();
        //type conversion
        double expression = (double)(v*v-u*u)/(2*a*s);
        System.out.println("The result of expession = " + expression);
    }
    
}
