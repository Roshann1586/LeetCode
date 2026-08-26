class Solution {
    public int minElement(int[] nums) {
    int smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int x=0;
            while(nums[i]!=0){
                x+=nums[i]%10;
                nums[i]/=10;
            }
            nums[i]=x;
            smallest=Math.min(smallest,x);
        }
        return smallest;
    }
}