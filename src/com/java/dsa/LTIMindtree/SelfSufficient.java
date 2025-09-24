package LTIMindtree;

public class SelfSufficient {
    static int needMoney(int[] arr1, int[] arr2)
    {
        int selfMoney = 0, requiredMoney = 0;
        for(int i : arr1){
            selfMoney += i;
        }

        for(int j : arr2) {
            requiredMoney += j;
        }

        return Math.abs(selfMoney - requiredMoney);
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 2};
        int[] arr2 = {5, 3, 4};
        System.out.println(needMoney(arr1, arr2));
    }
}
