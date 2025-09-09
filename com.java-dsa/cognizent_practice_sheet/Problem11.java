package cognizent_practice_sheet;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        System.out.println("Enter no of course :");
        int course = new Scanner(System.in).nextInt();
        String[] arr = new String[course];
        System.out.println("Enter course names :");
        for (int i=0; i<arr.length; i++) {
            String x = new Scanner(System.in).nextLine();
            arr[i] = x;
        }
        System.out.println("Enter the course to be searched:");
        String courseName = new Scanner(System.in).nextLine();

        Arrays.sort(arr);

        if(course > 20) {
            System.out.println("Invalid Input");
        }
        else if(Arrays.binarySearch(arr,courseName) >= 0){
            System.out.println(courseName+" course is available");
        }
        else{
            System.out.println("Course is not available");
        }
    }
}
