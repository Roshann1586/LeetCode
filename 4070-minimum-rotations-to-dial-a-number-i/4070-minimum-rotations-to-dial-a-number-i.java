class Solution {
    public int minRotations(String s) {
        int x=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            int y = Math.abs(x-(s.charAt(i)-'0'));
            sum+=Math.min(y,(10-y));
            x=s.charAt(i)-'0';
        }
        return sum;
    }
}