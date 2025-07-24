import java.util.Scanner;
public class SumN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i<=n){
            
            //Calculate Even Number
            int j= 2*i;

            //Checks Even number or not.
            if(j%2==0){
                sum=sum+j;
                System.out.println(sum);
            }
            i++;
            }
            
        }

    }
