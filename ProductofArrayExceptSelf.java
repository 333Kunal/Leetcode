import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int temp = 1;
            for(int j=0; j<n; j++){
                if(i == j){
                    continue;
                }
                else{
                    temp *= nums[j];
                }
            }
            ans[i] = temp;

        }
        return ans;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

}
