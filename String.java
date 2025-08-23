class ClassString {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                return true;
            }
            left++;
            right--;
        }
        return false;

    }
}