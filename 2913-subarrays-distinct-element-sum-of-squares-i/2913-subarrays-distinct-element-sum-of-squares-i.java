class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            HashSet <Integer> unique = new HashSet<>();
            int count=0;
            for(int j=i;j>=0;j--){
                if(!(unique.contains(nums.get(j)))){
                    count++;
                    unique.add(nums.get(j));
                }
                sum+=(count*count);
            }
        }
        return sum;
    }
}