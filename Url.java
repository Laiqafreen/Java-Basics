import java.util.Scanner;
public class Url{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URL link: ");
        String url = sc.nextLine();
        if(url.endsWith(".com"))
        {
            System.out.println("Commercial website");
        } 
        else if(url.endsWith(".org"))
        {
            System.out.println("Organizational website");
        } 
        else
        {
            System.out.println("Indian website");
        }

}
}