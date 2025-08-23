public class Findnumber {
    static int findNumber(int[] arr){
        int count =0;
        for(int num: arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int digit = countDigit(num);
        return digit%2==0;

    }

    static int countDigit(int num){
        int count =0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={23,4567,678,789089,0};
        System.out.println(findNumber(arr));
        
    }
    
}
