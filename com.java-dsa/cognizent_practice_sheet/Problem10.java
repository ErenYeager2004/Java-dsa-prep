package cognizent_practice_sheet;

import java.util.Scanner;

public class Problem10 {
    static void luckyNumber(int number) {
        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }

        if(sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0)  {
            System.out.println("Lucky Number");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the car no:");
        int number = new Scanner(System.in).nextInt();

        if(number < 0 || Integer.toString(number).length() > 4) {
            System.out.println(" invalid");
        }else{
            luckyNumber(number);
        }
    }
}
