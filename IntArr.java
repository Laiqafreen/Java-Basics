public class IntArr {
    public static void main(String[]args){
        int []Integers = {23,45,56,78,90};
        int num = 89;
        boolean isInArray = false ;
        for(int i : Integers){
            if(num==i){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Number is present inside Array");
        }else{
            System.out.println("Number is not present inside Array");
        }
      
            }
        }

    