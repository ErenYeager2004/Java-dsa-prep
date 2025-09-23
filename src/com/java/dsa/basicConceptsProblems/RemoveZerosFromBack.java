package basicConceptsProblems;

public class RemoveZerosFromBack {
    static String removeZeros(String str) {
        int i = str.length() - 1;

        while (i >= 0 && str.charAt(i) == '0') {
            i--;
        }

        if(i < 0) {
            return "";
        }

        return str.substring(0, i+1);
    }
    public static void main(String[] args) {
        String str = "51230100";
        System.out.println(removeZeros(str));
    }
    
}
