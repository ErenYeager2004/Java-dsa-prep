package strings;

import java.util.Scanner;

//Problem -> Returns the longest substring of s that is a palindrome
public class LongestPalindromicString {
    static String longestPalindromicStringBrute(String s) {
        //T.C -> O(n3)
        int maxlen = 0;
        String result = "";
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                String sub  = s.substring(i,j+1);
                if(isPalindrome(sub) && sub.length() > maxlen){
                    result = sub;
                    maxlen = sub.length();
                }
            }
        }
        return result;
    }

    private static boolean isPalindrome(String sub) {
        int l = 0, r = sub.length()-1;
        while(l<r) {
            if(sub.charAt(l++) != sub.charAt(r--)) return false;
        }
        return true;
    }


    //Optimized-Expand around Center--O(n2)
    static String longestPalindromicString(String s) {
        if(s == null || s.isEmpty()) return "";
        int start = 0, end = 0;
        for(int i=0; i<s.length(); i++) {
            int len1 = expand(s,i,i);
            int len2 = expand(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }

    private static int expand(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longestPalindromicStringBrute(str));
        System.out.println(longestPalindromicString(str));

    }
}
