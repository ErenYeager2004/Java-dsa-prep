package cognizent_practice_sheet;

import java.util.Scanner;

public class Problem2 {
    static void generateBill (int pizza, int puffs, int drinks) {
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puffs);
        System.out.println("No of cooldrinks:"+drinks);
        System.out.println("Total price="+((pizza*100)+(puffs*20)+(drinks*10)));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought:");
        int no_of_pizza = sc.nextInt();
        System.out.print("Enter the no of puffs bought:");
        int no_of_puffs = sc.nextInt();
        System.out.print("Enter the no of cool drinks bought:");
        int no_of_coldDrink = sc.nextInt();

        generateBill(no_of_pizza,no_of_puffs,no_of_coldDrink);
    }
}
