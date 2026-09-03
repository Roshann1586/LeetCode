class Solution {
    public int countSpecialIntegers(int[] nums) {
        int ans=0;
        HashMap <Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }
        int j=0;
        while(j<nums.length){
            int prev=nums[j];
            int count=0;
            while(j<nums.length && nums[j]==prev){
                count++;
                j++;
            }
            if(count==freq.get(nums[j-1])){
                ans++;
            }
        }
        return ans;
    }
}