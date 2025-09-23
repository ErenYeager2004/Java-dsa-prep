package strings;

public class CheckPalindrome {
    static boolean isPalindrome2(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return str.contentEquals(sb);
    }
    static boolean isPalindrome(String str) {
        return str.contentEquals(new StringBuilder(str).reverse());
    }
    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(isPalindrome(str));
        System.out.print(isPalindrome2(str));
    }
}
