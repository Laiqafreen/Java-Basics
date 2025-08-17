public class EvenoddSum {
    public static void main(String[] args) {
        int n=45678;
        int num=n;
        int evenSum =0;
        int oddSum=0;
        int pos=0;
        while(n>0){
            int d=n%10;
            pos++;
            n=n/10;
        }
        n=num;
        while(n>0){
            int d=n%10;
            if(pos%2==0){
                evenSum+=+d;
            }else{
                oddSum+=+d;
            }
            n/=10;
            pos--;
        }
        System.out.println(evenSum);
        System.out.println(oddSum);

    }
    
}
