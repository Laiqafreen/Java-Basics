import java.util.Scanner;

public class Replace{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            String s = sc.nextLine();
            s.replace("00","A");
            s.replace("01","T");
            s.replace("10","C");
            s.replace("11","G");
            System.out.println(s);
            t--;
            }

        }
    }

