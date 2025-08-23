public class FlipDigit {
    public static void main(String[] args) {
        int n=32145;
        int pos=0;
        int num=n;
        int newn=0;
        while(n>0) {
            int d=n%10;
            pos++;
            int posN = pos;
            int temp=posN;
            posN=d;
            d=temp;
            newn=newn+(int)Math.pow(10,posN-1)*d;
            n/=10;
        }

        
        System.out.println(newn);
    }
}

