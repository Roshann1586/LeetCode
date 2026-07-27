class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String x:words){
            int weight=0;
            for(char c:x.toCharArray()){
                weight+=(weights[c-'a']);
            }
            weight%=26;
            sb.append((char)(122-weight));
        }
        return sb.toString();
    }
}