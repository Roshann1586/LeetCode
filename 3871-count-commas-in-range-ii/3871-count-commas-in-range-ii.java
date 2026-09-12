class Solution {
    public long countCommas(long n) {
        long subtractor=999;
        long count=0;
        while(n-subtractor>0){
            count+=(n-subtractor);
            subtractor=(subtractor*1000)+999;
            
        }
        return count;
    }
}