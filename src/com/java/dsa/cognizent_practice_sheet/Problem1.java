package cognizent_practice_sheet;

import java.util.Scanner;


public class Problem1 {
    static void countFuelConsumption(int fuel, int distance) {
        float us_style = ((float) fuel /distance) * 100;
        float europe_style = (float)((distance * 0.6214) / (fuel * 0.2642));

        System.out.printf("Liters/100KM %.2f\n",us_style);
        System.out.printf("Miles/gallons %.2f",europe_style);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fuel = sc.nextInt();
        int distance = sc.nextInt();
        if(fuel < 0  || distance < 0){
            System.out.println("Invalid input");
            System.exit(0);
        }
        else{
            countFuelConsumption(fuel,distance);
        }
    }
}
