package basicConceptsProblems;

public class ArmstrongNumber {
    static boolean isArmstrong(int num) {
        //for 3 digits...
        int org = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit,3);
            num /= 10;
        }
        return org == sum;
    }

    static boolean isArmstrong2(int num) {
        //for n number...
        int n = Integer.toString(num).length();
        int org = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit,n);
            num /= 10;
        }
        return org == sum;
    }
    public static void main(String[] args) {
        int num = 1634;
        System.out.println(isArmstrong2(num));
    }
}
