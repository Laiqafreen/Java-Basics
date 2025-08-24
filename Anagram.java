import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2));

    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] s = s1.toCharArray();
        char[] t = s2.toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        for (int i = 0; i < s.length; i++) {
            if (s[i] != t[i]) {
                return false;
            }
        }
        return true;
    }

}
