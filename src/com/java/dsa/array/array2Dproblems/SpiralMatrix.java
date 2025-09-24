package array.array2Dproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    static void spiralOrder(int[][] matrix){
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int direction = 0;


        while(left <= right && top <= bottom) {
           // left -> right
            if(direction == 0){
                for(int col = left; col <= right; col++){
                    System.out.print(matrix[top][col] + " ");
                }
                top++;
            } else if (direction == 1) {
                for(int row = top; row <= bottom; row++){
                    System.out.print(matrix[row][right] + " ");
                }
                right--;
            }
            //right -> left
            else if (direction == 2) {
                for(int col = right; col >= left; col--){
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--;
            }
            //bottom -> top
            else{
                for(int row = bottom; row >= top; row--){
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }

            direction = (direction + 1) % 4;
        }


    }
    public static void main(String[] args) {

        int n,m;
        System.out.println("Enter no of rows");
        n = new Scanner(System.in).nextInt();
        System.out.println("Enter no of column");
        m = new Scanner(System.in).nextInt();

        int[][] matrix = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               matrix[i][j] = new Scanner(System.in).nextInt();
            }
        }
        spiralOrder(matrix);
    }
}
