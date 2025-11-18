package sorting.sortingProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingInLexicographicalOrder {

    static void sort(List<String> fruits) {
        for(int i = 0; i < fruits.size() - 1; i++) {
            int min = i;
            for(int j = i + 1; j < fruits.size(); j++){
                if(fruits.get(min).compareToIgnoreCase(fruits.get(j)) > 0) {
                    min = j;
                }
            }

            if(i != min) {
                Collections.swap(fruits, i, min);
            }
        }
    }
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("papaya","lime","watermelon","apple","mango","kiwi");

        sort(fruits);

        fruits.forEach(x -> System.out.print(x + " "));
    }
}
