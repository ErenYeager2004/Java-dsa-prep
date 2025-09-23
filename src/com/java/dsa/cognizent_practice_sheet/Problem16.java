package cognizent_practice_sheet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem16 {
    static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            while(set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, i - left + 1);
        }

        return maxLen;
        
    }

    public static void main(String[] args) {
        String s ;
        s = new Scanner(System.in).nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
    
}