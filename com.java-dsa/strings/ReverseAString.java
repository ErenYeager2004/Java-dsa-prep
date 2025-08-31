package strings;
public class ReverseAString {
    static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        String str = "Debjit Saha";
        System.out.println(reverse(str));
    }
}
