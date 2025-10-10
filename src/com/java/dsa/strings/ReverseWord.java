package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {

    public static void main(String[] args) {
        String str = "I Love Java";
        String ans = Arrays.stream(str.split(" ")).map(s -> new StringBuilder(str).reverse().toString()).collect(Collectors.joining());
        System.out.println(ans);
    }
}
