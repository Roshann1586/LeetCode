class Solution {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int x:nums){
            if(x>largest){
                secondLargest = largest;
                largest=x;
            }
            else if(x>secondLargest){
                secondLargest = x;
            }
        }
        return (secondLargest-1)*(largest-1);
    }
}