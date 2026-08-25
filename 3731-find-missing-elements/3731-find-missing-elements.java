class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean[] values = new boolean[101];
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            values[nums[i]]=true;
            smallest = Math.min(smallest,nums[i]);
            largest = Math.max(largest,nums[i]);
        }
        for(int i=smallest;i<largest;i++){
            if(!values[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}