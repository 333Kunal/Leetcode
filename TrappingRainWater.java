public class TrappingRainWater {
    public static int trap(int[] height){
        int ml=0, mr=0, l=0, r=height.length-1;
        int res=0;
        while(l<=r){
            if(height[l]<height[r]){
                ml = Math.max(ml,height[l]);
                res += ml - height[l++];
            }
            else{
                mr = Math.max(mr, height[r]);
                res += mr - height[r--];
            }
        }
        return res;
    }
    public static void main(String[] args){
        int height[]={4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}
