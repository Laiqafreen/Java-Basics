import java.util.Scanner;
public class Day {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        switch(n){
            case 1 : if(n==1) {
                System.out.println("Day is Monday");
                break;
            }
            case 2 : if(n==2){
                System.out.println("Day is Tuesday");
                break;
            }
            case 3 : if(n==3){
                System.out.println("day is Wednesday");
                break;
            }
            case 4 : if(n==4){
                System.out.println("Day is Thursday");
                break;
            }
            case 5 : if(n==5){
                System.out.println("Day is Friday");
                break;
            }
            case 6 : if(n==6){
                System.out.println("Day is Saturday");
                break;
            }
            case 7 : if(n==7){
                System.out.println("Day is Sunday");
                break;
            }
            default :{
                System.out.println("Invalid Input");
            }

        }

    }
    
}
