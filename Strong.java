public class Strong {
    public static void main(String[] args) {
        int n=145;
        int ncopy=n;
        int fact=1;
        int num=0;
        while(n!=0){
            int d=n%10;
            while(d!=0){
                fact=fact*d;
                d--;
            }
            num=num+fact;
            fact=1;
            n=n/10;
        }
        System.out.println(ncopy==num?"Strong" : "Not Strong");
    }
    
}
