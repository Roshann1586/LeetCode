import java.util.Arrays;
class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight);
        int last=Integer.MAX_VALUE;
        int count=1;
        long sum=0;
        for(int i=(maximumHeight.length-1);i>=0;i--){
            if(maximumHeight[i]==last){
                maximumHeight[i]-=count++;
                if(maximumHeight[i]<=0){
                    return -1;
                }
                sum+=maximumHeight[i];
            }
            else if(maximumHeight[i]>=(last-count)){
                if(last-count<=0){
                    return -1;
                }
                sum+=(last-count);
                last-=count;
                count=1;
            }
            else{
                last=maximumHeight[i];
                sum+=maximumHeight[i];
                count=1;
            }
        }
        return sum;
    }
}