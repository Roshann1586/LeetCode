class Solution {
    public int maximumLengthSubstring(String s) {
        int[] c = new int[26];
        int left=0;
        int right=0;
        int length=0;
        int maxLength=0;
        while((left<=right) && (right<s.length())){
            if(c[s.charAt(right)-'a'] <= 1){
                c[s.charAt(right)-'a']++;
                length=right-left+1;
                right++;
                
                maxLength = Math.max(length, maxLength);
            }
            else{
                while((left<right) && (c[s.charAt(right)-'a'] >1)){
                    c[s.charAt(left)-'a']--;
                    left++;
                }
            }
        }
        return maxLength;
    }
}