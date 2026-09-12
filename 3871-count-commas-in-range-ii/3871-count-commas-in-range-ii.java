class Solution {
    public long countCommas(long n) {
        long subtractor=999;
        long count=0;
        while(n-subtractor>0){
            count+=(n-subtractor);
            for(int i=0;i<3;i++){
                subtractor*=10;
                subtractor+=9;
            }
        }
        return count;
    }
}