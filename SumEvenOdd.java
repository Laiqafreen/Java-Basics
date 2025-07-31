public class SumEvenOdd {
    public static void main(String args[]){
        int n = 8765;
        int pos=0;
        int num=n;
        int digit=0;
        int sumEven=0;
        int sumOdd=0;
        while(n!=0){
            digit=n%10;
            n=n/10;
            pos++;
        }
        n=num;
        for(int i=1;i<=n;i++){
            int number=n%10;
           if(pos%2==0){
            sumEven=sumEven+number;
           }else{
            if(pos%2!=0){
            sumOdd=sumOdd+number;
            }
           }
           n=n/10;
           pos--;

        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
        }
        

        
