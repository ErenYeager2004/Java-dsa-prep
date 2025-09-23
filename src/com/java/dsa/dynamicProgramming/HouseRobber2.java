package dynamicProgramming;
public class HouseRobber2 {
    public static int Robbery(int[]arr){
        //base cases
        if(arr.length == 0)  return 0;
        if(arr.length == 1) return arr[0];
        if(arr.length == 2) return Math.max(arr[0],arr[1]);
        int first = arr[0];
        int second = 0;
        for(int i=1;i<=arr.length-2;i++){
            int pick = arr[i]+ second;
            int notPick = first;

            int curr = Math.max(pick,notPick);
            second = first;
            first = curr;
        }

        int third  = arr[1];
        int forth = 0;
        for(int i = 2;i<=arr.length-1;i++){
            int pick = arr[i]+ forth;
            int notPick = third;
            int curr = Math.max(pick,notPick);
            forth = third;
            third = curr;
        }

        return Math.max(first,third);
    }
    public static void main(String[] args) {
        int [] arr = {1,3,4,5};
        System.out.println(Robbery(arr));
    }
}
