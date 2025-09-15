package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacters {
    static char NonRepeatingCharacters(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequencies
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeating char
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0'; // no non-repeating character found
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(NonRepeatingCharacters(str)); // Output: f
    }
}
