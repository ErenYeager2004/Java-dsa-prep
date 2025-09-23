package cognizent_practice_sheet;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Problem15 {
    static List<Integer> gpSeries(int A1, int R, int Z) {
        List<Integer> ans = new ArrayList<>();
        int res = 0;
        while(res <= Z) {
            res = A1 * R;
            ans.add(A1);
            A1 = res;
        }
        return ans;
    }
    public static void main(String [] args) {
        int A1, R, Z;
        A1 = new Scanner(System.in).nextInt();
        R = new Scanner(System.in).nextInt();
        Z = new Scanner(System.in).nextInt();

        System.out.print(gpSeries(A1, R, Z));
    }
}