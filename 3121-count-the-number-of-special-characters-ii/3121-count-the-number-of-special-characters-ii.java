class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        int[] ans = new int[26];
        for(int i=0;i<word.length();i++){
            if((word.charAt(i)-'a')<0){
                if(ans[word.charAt(i)-'A']==1){
                    ans[word.charAt(i)-'A']=2;
                    count++;
                }
                else if(ans[word.charAt(i)-'A']==0){
                    ans[word.charAt(i)-'A']=3;
                }
                
            }
            else if(ans[word.charAt(i)-'a']==0){
                ans[word.charAt(i)-'a']=1;
            }
            else if(ans[word.charAt(i)-'a']==2){
                ans[word.charAt(i)-'a']=3;
                count--;
            }
        }
        return count;
    }
}