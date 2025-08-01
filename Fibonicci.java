public class Fibonicci{
    public static void main(String[] args) {
        int n=10;
        int f=0;
        int s=1;
        System.out.println(f);
        System.out.println(s);
        while(n>0){
            int next=f+s;
            System.out.println(next);
            f=s;
            s=next;
            n--;

        }
        
    }
}