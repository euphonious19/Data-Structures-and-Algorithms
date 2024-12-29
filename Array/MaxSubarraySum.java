public class MaxSubarraySum {
    // BRUTE FORCE APPROACH : TC :-> O(n^3) #[We can optimised solution of MAXSUBARRAYSUM by using PREFIX SUM]
    public static void printMaxSubarraySum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE ;
        for(int i=0;i<numbers.length ;i++){
            int start =i;
            for(int j=i ; j<numbers.length ; j++){
                int end =j;
                currSum=0;
                for(int k=start ; k<=end ;k++){
                    //SubarraySum calc
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum ;
                }
            }
        }
        System.out.println("MAXIMUM SUBARRAY SUM : " + maxSum );
    }
    public static void main(String[] args) {
        int numbers[]= { 1, -2, 6, -1, 3 };
        printMaxSubarraySum(numbers);
    }
}
