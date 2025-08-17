public class Rotate {
    public static void main(String[] args) {
        int n=12345;
        int rotN=n;
        int div=10000;
        int k=2;
        while(k>0){
            int d=n%10;
            rotN=rotN/10+div*d;
            System.out.println(rotN);
            n/=10;
            k--;
        }
    }
    
}
