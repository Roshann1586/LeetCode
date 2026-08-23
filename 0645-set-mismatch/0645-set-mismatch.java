import java.util.Arrays;
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int x = nums.length;
        int expected = (x*(x+1))/2;
        int[] ans = new int[2];
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            if(nums[i]==nums[i+1]){
                ans[0]=nums[i];
            }
        }
        sum+=nums[x-1];
        ans[1]=expected-(sum-ans[0]);
        
        return ans;
    }
}