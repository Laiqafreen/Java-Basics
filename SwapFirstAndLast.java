public class SwapFirstAndLast   {
    public static void main(String args[]){
        int num = 45678;
        int copy = num;
        int last = num%10;
        int div = 1;
        while(num!=0){
            num=num/10;
            div=div*10;
        }
        num = copy;
        div =div/10;
        int first = num/div;
        int mid = num%div;
        mid=mid/10;
        int r = last * div + mid * 10 + first;
        System.out.println(r);


    }

}