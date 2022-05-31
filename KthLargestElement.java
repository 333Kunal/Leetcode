import java.util.Arrays;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k){
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }
    public static void main(String[] args){
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }
}
