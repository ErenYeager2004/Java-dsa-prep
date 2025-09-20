package strings;

public class RemoveVowels {
    static  String removeVowels(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if("AEIOUaeiou".indexOf(ch) == -1) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Debjit";
        System.out.println(removeVowels(str));
    }
}
