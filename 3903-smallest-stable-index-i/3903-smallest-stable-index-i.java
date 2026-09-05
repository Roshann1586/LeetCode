class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int minimum[] = new int[nums.length];
        int mini = Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            mini=Math.min(mini,nums[i]);
            minimum[i]=mini;
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(nums[i],maxi);
            System.out.println(maxi);
            System.out.println(minimum[i]);
            if((maxi-minimum[i])<=k){
                return i;
            }
        }
        return -1;
    }
}