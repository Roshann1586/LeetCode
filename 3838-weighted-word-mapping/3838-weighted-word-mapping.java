class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        for(String x:words){
            int weight=0;
            for(char c:x.toCharArray()){
                weight+=(weights[c-'a']);
            }
            weight%=26;
            ans+=(char)(122-weight);
        }
        return ans;
    }
}