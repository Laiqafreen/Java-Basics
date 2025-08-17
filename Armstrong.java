public class Armstrong {
    public static void main(String[] args) {
        int n =153;
        int copy=n;
        int num=0;
        int count = 0;
        while(n!=0){
            int d=n%10;
            count++;
            n/=10;
        }
        n=copy;
        while(n!=0){
            int d=n%10;
            num=num+(int)Math.pow(d, count);
            n/=10;
        }
        System.out.println(num);
        System.out.println(copy==num?"Armstrong":"Not Armstrong");
    }
    
}
