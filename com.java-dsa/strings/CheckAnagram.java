package strings;

import java.util.Arrays;
import java.util.HashMap;

public class CheckAnagram {
    static boolean checkAnagram(String s1, String s2){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i : s1.toCharArray()) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (char i : s2.toCharArray()) {
            if (!map.containsKey(i)) {
                return false;
            }
            map.put(i,map.get(i)-1);
            if(map.get(i) == 0) {
                map.remove(i);
            }
        }

        return map.isEmpty();
    }

    static boolean isAnagram(String s1, String s2) {
        return s1.length() == s2.length() &&
            Arrays.equals(
                s1.chars().sorted().toArray(),
                s2.chars().sorted().toArray()
            );
    }
    public static void main(String[] args) {
        String s1 = "gum";
        String s2 = "mug";
        System.out.println(checkAnagram(s1,s2));
        System.out.println(isAnagram(s1,s2));

    }
}
