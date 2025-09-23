package dynamicProgramming;

public class NinjaTraining {
    //recursive solution...
    static int getMaxMerit(int[][]arr,int days,int lastTask){
        if(days == 0){
            int maxi = 0;
            for(int i=0;i<3;i++){
                if(i!=lastTask){
                   maxi = Math.max(maxi,arr[0][i]);
                }
            }
            return maxi;
        }
        int maxi = 0;
        for(int i=0;i<3;i++){
            if(i!=lastTask){
                int points = arr[days][i]+getMaxMerit(arr,days-1,i);
                maxi = Math.max(maxi,points);
            }
        }
        return maxi;
    }


    public static void main(String[] args) {
        int [][] arr = {{10,50,1},
                        {11,100,5},
                        {100,100,100},
                        {3,14,29}
                        };
        int[]dp = new int[arr.length];
        System.out.println(getMaxMerit(arr,arr.length-1,3));
       // System.out.println(getMaxMerit2(arr,arr.length-1,3,dp));

    }
}
