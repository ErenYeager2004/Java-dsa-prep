package strings;

public class CheckPalindrome {
    static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(isPalindrome(str));
    }
}
