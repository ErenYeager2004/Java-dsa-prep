package strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWord {

    public static void main(String[] args) {
        String str = "I Love Java";
        String[] words = str.split(" ");
        List<String> list = Arrays.stream(words)
                .map(word -> new StringBuilder(word).reverse().toString())
                .toList();

        System.out.println(list);
    }
}
