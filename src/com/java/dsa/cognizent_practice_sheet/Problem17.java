package cognizent_practice_sheet;

import java.util.Arrays;
import java.util.Scanner;

public class Problem17 {
    static int findMinimum(int N, int[] A) {
        int min = Integer.MAX_VALUE;
        if (A.length == 1) {
            return A[0];
        }
        if (A.length == 0) {
            return 0;
        }
        
        Arrays.sort(A);
        return A[0] + A[1];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            int x = sc.nextInt();
            A[i] = x;
        }
        sc.close();

        // System.out.println(Arrays.toString(A));
        System.out.println(findMinimum(N - 1, A));

    }
}
