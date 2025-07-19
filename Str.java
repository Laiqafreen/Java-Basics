public class Str {
    public static void main(String args[]){
       
        //String Class Methods in java
        
        String str = "Afreen";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0));
        System.out.println(str.substring(0,5));
        System.out.println(str.startsWith("Af"));
        System.out.println(str.startsWith("een"));
        System.out.println(str.replace("Af", "Nas"));
        System.out.println(str.endsWith("reen"));
        System.out.println(str.endsWith("sam"));
        System.out.println(str.charAt(4));
        System.out.println(str.indexOf("f"));
        System.out.println(str.indexOf("z"));
        System.out.println(str.indexOf("r", 1));
        System.out.println(str.indexOf("r", 4));
        System.out.println(str.indexOf("e"));
        System.out.println(str.lastIndexOf("e"));
        System.out.println(str.lastIndexOf("r",4));
        System.out.println(str.lastIndexOf("n",4));
        System.out.println(str.equals("AFreen"));
        System.out.println(str.equals("Afreen"));
        System.out.println(str.equalsIgnoreCase("AFrEEn"));
        String string = "Banana";
        System.out.println(string.indexOf("n"));
        System.out.println(string.lastIndexOf("n")); 
        System.out.println(str.isEmpty());
        System.out.println(str.compareTo("AFREENLAIQ"));
        System.out.println(str.compareToIgnoreCase("AFREENLAIQ"));
        System.out.println(str.toString());
        System.out.println(str.contains("een"));
        String strr = " Afreen  ";
        System.out.println(str.replaceAll("Afreen","Farheen"));
        System.out.println(str.replaceFirst("A","Fa"));
        System.out.println(strr.strip());
        System.out.println(strr.stripLeading());
        System.out.println(strr.stripTrailing());
        System.out.println(str.intern()); //use of this
        System.out.println(str.join("4","Laiq")); // what is delimeter?
        System.out.println(str.matches("Farheen"));
        System.out.println(str.toCharArray());
        System.out.println(str.getBytes());
 
    }
    
}
