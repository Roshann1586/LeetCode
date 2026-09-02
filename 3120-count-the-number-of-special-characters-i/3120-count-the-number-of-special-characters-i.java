class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        int[] ans = new int[52];
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)-'a'<0){
                ans[word.charAt(i)-'A'+26]=1;
            }
            else{
                ans[word.charAt(i)-'a']=1;
            }
        }
        for(int i=0;i<26;i++){
            if(ans[i]==1 && ans[i+26]==1){
                count++;
            }
        }
        return count;
    }
}