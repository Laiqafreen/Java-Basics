import java.util.Scanner;
public class Ifelse {
    public static void main(String args[])
    {
    Scanner sc = new Scanner (System.in);
    int sub1,sub2,sub3,sum;
    float percentage;
    System.out.println("Enter English marks : \nEnter Mathematics marks : \nEnter Hindi marks : ");
    sub1 = sc.nextInt();
    sub2 = sc.nextInt();
    sub3 = sc.nextInt();
    sum = sub1 + sub2 + sub3;
    percentage = sum / 3.0f;
    System.out.println("Your Percentage : " + percentage);
    if(sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && percentage >= 40){
        System.out.println("You are PASS");}
    else{
        System.out.println("You are FAIL");
    }
           
    }

}
    
