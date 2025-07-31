public class Armstrong {
    public static void main(String args[]){
        int n = 153;
        int num=n;
        int count =0;
        int sum=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        n=num;
        while(n>0){
        int d=n%10;
        int digit=(int)Math.pow(d, count);
        sum = sum +digit;
        n=n/10;
        }
        if(sum==num){
            System.out.println("Armstrong");
        }else{
            System.out.println(("Not Armstrong"));
        }
        


    } 
    
}
