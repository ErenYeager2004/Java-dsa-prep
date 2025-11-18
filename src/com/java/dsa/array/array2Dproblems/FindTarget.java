package array.array2Dproblems;

public class FindTarget {
    static void find(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;

        // start from top-right
        int row = 0, col = cols - 1;

        while (row < rows && col >= 0) {
            if (arr[row][col] == target) {
                System.out.println("Found at: (" + row + "," + col + ")");
                return;
            } else if (arr[row][col] > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        }

        System.out.println("Not found");

    }
    public static void main(String[] args) {
        int[][]  arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 14;

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        find(arr, target);
    }
}
