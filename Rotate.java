public class Rotate {
    public static void main(String args[]){
        int num = 12345;
        int k =2;
        int count = 0;
       int rotation=0;
        int n = num;
        while(num>0){
            count ++;
            num=num/10;
        }
        num=n;
        while(k>0){
        int last = num % 10;
        int div = (int) Math.pow(10, count-1);
        num= num /10;
        rotation = last * div + num; 
        num = rotation;
        k--;
        System.out.println(rotation);
        }
        

    }
    
}
