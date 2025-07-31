import java.util.Scanner;

class C
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Character");
        String input = sc.next();
		char ch = input.toLowerCase().charAt(0);
		
        switch(ch){
		        case  'a':
		        case  'e':
		        case  'i':
		        case  'o':
		        case  'u': 
		            System.out.println("Vowel");
		            break;
		         default:
		            System.out.println("Invalid");
		        
		        }
                sc.close();
		

	        }
         }


    
