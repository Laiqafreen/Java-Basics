
import java.util.Scanner;
public class N {
    public static void main(String args[])
    {
        int n1 = 87;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n2 = sc.nextInt();
        //Comparison Operators returns boolean values.
        System.out.println(n1==n2);
        System.out.println(n1<=n2);
        System.out.println(n1>=n2);
        System.out.println(n1>n2);
        System.out.println(n1!=n2);
        System.out.println(n1<n2);
    }
    
}
