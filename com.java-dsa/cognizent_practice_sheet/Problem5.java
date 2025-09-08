package cognizent_practice_sheet;

import java.util.Scanner;

public class Problem5 {
    static void getTicketCost(int ticket, String refreshment, String circle, String coupon) {
        float total = 0.0f;
        if(circle.equalsIgnoreCase("k") ){
            total = ticket * 75;
        }else {
            total = ticket * 150;
        }

        if(ticket  >  20) {
            if(coupon.equalsIgnoreCase("y")) {
                total = (float) (total - ((total * 0.10) + (total * 0.02)));
            }
            else{
                total = (float) (total - (total * 0.10));
            }
        }

        if(refreshment.equalsIgnoreCase("y")) {
            total += ticket * 50;
        }
        System.out.println("Ticket cost:"+total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of ticket:");
        int ticket = sc.nextInt();
        System.out.print("Do you want refreshment:");
        String refreshment = sc.next();
        System.out.print("Do you have coupon code:");
        String coupon = sc.next();
        System.out.print("Enter the circle:");
        String circle = sc.next();

        if(ticket < 5  || ticket > 40){
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        } else if (!circle.equalsIgnoreCase("k") && !circle.equalsIgnoreCase("q") ) {
            System.out.println("Invalid Input");
        }else {
                getTicketCost(ticket,refreshment,circle,coupon);
        }
    }
}
