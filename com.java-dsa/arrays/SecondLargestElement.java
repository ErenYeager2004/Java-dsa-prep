package arrays;

public class SecondLargestElement {
    static int secondLagest(int[] arr){
        int max = arr[0];
        for(int i : arr) {
            if(max < i) max = i;
        }

        int secondLarge = 0;
        for(int i : arr){
            if(secondLarge < i && i < max) {
                secondLarge = i;
            }
        }
        return secondLarge;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(secondLagest(arr));
    }
}
