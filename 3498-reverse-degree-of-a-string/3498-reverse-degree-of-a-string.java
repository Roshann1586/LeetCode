class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int c = 26-s.charAt(i)+'a';
            System.out.println(c);
            sum+=(c*(i+1));
        }
        return sum;
    }
}