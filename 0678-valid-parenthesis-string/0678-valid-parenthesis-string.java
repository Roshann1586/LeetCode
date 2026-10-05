class Solution {
    public boolean checkValidString(String s) {
        Stack <Integer> st1 = new Stack<>();
        Stack <Integer> st2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st1.push(i);
            }
            else if(s.charAt(i)=='*'){
                st2.push(i);
            }
            else{
                if(!st1.isEmpty()){
                    st1.pop();
                }
                else if(!st2.isEmpty()){
                    st2.pop();
                }
                else{
                    return false;
                }
                
            }
        }
        while(!st1.isEmpty() && !st2.isEmpty()){
            if(st1.pop()>st2.pop()){
                return false;
            }
        }
        return st1.isEmpty();
    }
}