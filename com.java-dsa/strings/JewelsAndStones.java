package strings;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stone = "aAAbbbb";

        int count = 0;

        for(char s : stone.toCharArray()) {
            for(char j : jewels.toCharArray()) {
                if(j == s) {
                    count ++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
