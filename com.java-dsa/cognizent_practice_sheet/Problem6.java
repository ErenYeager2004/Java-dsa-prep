package cognizent_practice_sheet;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the month:");
        int month = sc.nextInt();
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid Month";
        };


        System.out.println("Season: "+ season);
    }
}
