public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currentSum= 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(currentSum , maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

