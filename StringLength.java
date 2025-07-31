public class StringLength {
	public static void main (String[] args) 
	{
		String s="Coding on CodeChef";
		String s1=s.substring(0,6);
        String s2=s.substring(7, 9);
        String s3=s.substring(10, 18);
        int n=s.length();
        int n1=s1.length();
        int n2=s2.length();
        int n3=s3.length();
        System.out.println(s1+" - "+n1);
        System.out.println(s2+" - "+n2);
        System.out.println(s3+" - "+n3);
        System.out.println(s+" - "+n);

	}
}

    

