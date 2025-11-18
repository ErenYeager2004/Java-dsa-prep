package strings;

public class PrintFirstWordOfAString {
    public static void main(String[] args) {
        String str = "Koi Mil Gaya Meow Meow ";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                if(i == 0 || str.charAt(i - 1) == ' '){
                    System.out.println(str.charAt(i));
                }
            }
        }
    }
}

