public class MaximumProductSubarray {
    public static int maxProduct(int[] nums){
        int maxProduct = Integer.MIN_VALUE;
        int productForward = 1;
        int productBack = 1;

        int i=0, j=nums.length-1;

        while(i < nums.length){
            productForward *= nums[i];
            if(maxProduct < productForward){
                maxProduct = productForward;
            }
            if(productForward == 0){
                productForward = 1;
            }

            productBack *= nums[j];
            if(maxProduct < productBack){
                maxProduct = productBack;
            }
            if(productBack == 0){
                productBack = 1;
            }

            i++; j--;
        }
        return maxProduct;
    }
    public static void main(String[] args){
        int nums[] = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
