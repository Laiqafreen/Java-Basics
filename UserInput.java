import java.util.Scanner;
public class UserInput {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in) ;

        //to take user input for array.
        //ask for size of array.
        System.out.println("Enter elements of size : ");
        int size = sc.nextInt();
             
    //create empty array.
    int []arr = new int[size];

    //take user input.
    System.out.println("Enter "+ size + " elements : " );
    for(int i = 0 ; i<size ; i++){
        arr[i] = sc.nextInt();
    }
    for ( int i = 0 ; i<arr.length;i++){
        System.out.print(arr[i]);
        System.out.print(" ");
    }
    
    
    
}
}
