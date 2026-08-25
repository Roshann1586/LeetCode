import java.util.Arrays;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList <Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int smallest=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if((nums[i]^(count+smallest))!=0){
                while((nums[i]^(count+smallest))!=0){
                    ans.add(count+smallest);
                    count++;
                }
            }
            count++;
        }
        return ans;
    }
}