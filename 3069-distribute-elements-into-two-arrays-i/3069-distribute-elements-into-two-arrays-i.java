class Solution {
    public int[] resultArray(int[] nums) {
        LinkedList <Integer> st1 = new LinkedList<>();
        LinkedList <Integer> st2 = new LinkedList<>();
        st1.offer(nums[0]);
        st2.offer(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(st1.peekLast()>st2.peekLast()){
                st1.offer(nums[i]);
            }
            else{
                st2.offer(nums[i]);
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(!st1.isEmpty()){
                nums[i]=st1.poll();
            }
            else if(!st2.isEmpty()){
                nums[i]=st2.poll();
            }
            
        }
        return nums;
    }
}