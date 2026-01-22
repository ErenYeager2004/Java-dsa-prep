package strings;

public class MoveHashes {

    static String moveHash(String str) {
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(c == '#') {
                result.append(c);
            }
        }
        for(char c : str.toCharArray()) {
            if(c != '#') {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "Move#Hash#to#Front";
        System.out.println(moveHash(str));

    }
}
