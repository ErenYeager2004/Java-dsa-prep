package cognizent_practice_sheet;

import java.util.Scanner;

public class Problem3 {
    static void magicConverter(int[] arr){
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]+"-"+(char)arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.print("Enter the digits:");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            int x = sc.nextInt();
            arr[i] = x;
        }

        magicConverter(arr);
    }
}
