class Solution {
    public int countRotations(String s, int k) {
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                score++;
            }
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            score++;
        }
        if(score==k){
            return s.length()-score;
        }
        else if(score==(k+1)){
            return score;
        }
        else{
            return 0;
        }
    }
}