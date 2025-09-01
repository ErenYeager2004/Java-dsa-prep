package basicConceptsProblems;

public class CountVowels_Consonants {
    static void countVowels_Consonents(String str) {
        int vowel = 0, consonant = 0;
        for(char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) {
                break;
            } else if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowel ++;
            }
            else{
                consonant++;
            }
        }
        System.out.println("Vowels :"+vowel + " Consonant :"+consonant);
    }
    public static void main(String[] args) {
        String str = "Automation";
        countVowels_Consonents(str);
    }
}
