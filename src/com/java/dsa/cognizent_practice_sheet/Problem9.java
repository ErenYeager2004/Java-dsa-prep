package cognizent_practice_sheet;

import java.util.Scanner;

public class Problem9 {
    static float countAppraisal(int salary, float rating) {
        float ans;
        if(rating > 1 && rating <= 3) {
            ans = (float) (salary + (salary * 0.10));
        } else if (rating > 3 && rating <=4) {
            ans = (float) (salary + (salary * 0.25));
        }else{
            ans = (float) (salary + (salary * 0.30));
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary :");
        int salary = sc.nextInt();
        System.out.println("Enter the Performance appraisal rating :");
        float rating = sc.nextFloat();

        if(salary < 1) {
            System.out.println("Invalid Input");
        }
        else if(rating < 1 || rating > 5){
            System.out.println("Invalid Input");
        }else{
            System.out.println(countAppraisal(salary, rating));
        }
    }
}
