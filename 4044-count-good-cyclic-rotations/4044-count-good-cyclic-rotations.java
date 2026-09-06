class Solution {
    public int countGoodRotations(int[] nums) {
        long leftSum=0;
        long rightSum=0;
        for(int i=0;i<nums.length/2;i++){
            leftSum+=nums[i];
        }
        for(int i=nums.length/2;i<nums.length;i++){
            rightSum+=nums[i];
        }
        int leftPointer=0;
        int rightPointer=nums.length/2;
        int count=0;
        int ans=0;
        if(leftSum>rightSum){
            ans++;
        }
        while(count<nums.length-1){
            leftSum-=nums[leftPointer];
            leftSum+=nums[rightPointer];
            rightSum+=nums[leftPointer];
            rightSum-=nums[rightPointer];
            leftPointer++;
            rightPointer=(rightPointer+1)%nums.length;
            count++;
            if(leftSum>rightSum){
                ans++;
            }
        }
        return ans;
    }
}