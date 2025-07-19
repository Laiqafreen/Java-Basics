import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int cnt = 0;
        for (int i=2;i<num;i++){
        if(num%i==0){
            cnt++;
        }
    }
    if(cnt==0){
        System.out.println("Prime no");
    }else{
        System.out.println("Not a prime");
    }

    }
       
}