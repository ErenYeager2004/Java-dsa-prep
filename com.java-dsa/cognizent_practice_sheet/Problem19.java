package cognizent_practice_sheet;

public class Problem19 {
    static int totalVisit(int[] arr) {
        int count = 0;
        int i = 1;
        while (i <= arr.length) {
            count += 1;
            i += arr[i - 1];
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,1};
        System.out.println(totalVisit(arr));
    }
}
