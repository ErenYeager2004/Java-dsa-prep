package strings;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    static boolean isValidAnagramBrute(String s, String t) {
        // Brute force O(n log n)
        if(s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }

    static boolean isValidAnagram(String s, String t) {
        //using array hashing O(n)
        if(s.length() != t.length()) return false;
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i : count) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(isValidAnagramBrute(s,t));
        System.out.println(isValidAnagram(s,t));
    }
}
