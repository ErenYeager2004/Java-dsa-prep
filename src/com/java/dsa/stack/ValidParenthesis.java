package stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    static boolean isValid(String str) {
        Stack<Character> temp = new Stack<>();
        for(int i =0; i <= str.length() - 1; i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                temp.push(str.charAt(i));
            }else{
                if(str.charAt(i) == ')' && temp.peek() == '('){
                    temp.pop();
                } else if (str.charAt(i) == '}' && temp.peek() == '{') {
                    temp.pop();
                } else if (str.charAt(i) == ']' && temp.peek() == '[') {
                    temp.pop();
                }
            }
        }

        return temp.isEmpty();
    }
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        if(isValid(str)){
            System.out.println("Valid Parenthesis");
        }else{
            System.out.println("Not a valid parenthesis");
        }
    }
}
