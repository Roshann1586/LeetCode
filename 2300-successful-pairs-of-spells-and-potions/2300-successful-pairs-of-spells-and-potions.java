import java.util.Arrays;
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int ans[] = new int[spells.length];
        int k=potions.length-1;
        while((k>0)&&(potions[k]>=success)){
            k--;
        }
        if(k==0){
            for(int i=0;i<spells.length;i++){
                ans[i]=potions.length;
            }
            return ans;
        }
        for(int i=0;i<spells.length;i++){
            int left=0;
            int right=k;
            int mid=0;
            int count=0;
            while(left<=right){
                mid=left+(right-left)/2;
                if((long) spells[i]*potions[mid]<success){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            count=potions.length-left;
            ans[i]=count;
        }
        return ans;
    }
}