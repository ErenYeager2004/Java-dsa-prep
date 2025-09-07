package cognizent_practice_sheet;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students placed in CSE:");
        int cse = sc.nextInt();
        System.out.print("Enter the no of students placed in ECE:");
        int ece = sc.nextInt();
        System.out.print("Enter the no of students placed in MECH:");
        int mech = sc.nextInt();

        if(cse < 0 || ece < 0 || mech < 0) {
            System.out.println("Input is Invalid");
        }else if (cse == mech && ece == mech) {
            System.out.println("None of the department has\n" +
                "got the highest placement");
        }else{
            if(cse > ece && cse > mech){
                System.out.println("Highest placement CSE");
            }
            else if(ece > cse && ece > mech){
                System.out.println("Highest placement ECE");
            }
            else {
                System.out.println("Highest placement MECH");
            }
        }

    }
}
