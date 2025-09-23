package cognizent_practice_sheet;

import java.util.Scanner;

public class Problem8 {
    static boolean isPalindrome(int n) {
        int org = n;
        int rev = 0;
        while(n != 0) {
            rev = rev * 10 + n%10;
            n /= 10;
        }
        return org == rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(isPalindrome(number)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}




