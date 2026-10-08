class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        Stack <Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                if(s.charAt(i)=='('){
                    st.push('(');
                }
                else if((s.charAt(i)==')') && (st.size()!=1)){
                    st.pop();
                    ans+=")";
                }
                else{
                    st.pop();
                }
            }
            else{
                if(s.charAt(i)=='('){
                    ans+="(";
                    st.push('(');
                }
                else if((s.charAt(i)==')') && (st.size()!=1)){
                    ans+=")";
                    st.pop();
                }
                else{
                    st.pop();
                }
            }
        }
        return ans;
    }
}