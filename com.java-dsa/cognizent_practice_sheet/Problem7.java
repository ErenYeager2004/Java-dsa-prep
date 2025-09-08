package cognizent_practice_sheet;

import java.util.Scanner;

public class Problem7 {
    static boolean isPrime(int n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i=3; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = n; i <= m; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
