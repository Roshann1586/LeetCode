class Solution {
    
    public void generate(ArrayList <String> ans, int n, int o, int c, String str){
        if((o==n)&&(c==n)){
            ans.add(str);
            return;
        }
        if(o<n){
            generate(ans,n,o+1,c,str+'(');
        }
        if((c<n) && (c<o)){
            generate(ans,n,o,c+1,str+')');
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList <String> ans = new ArrayList<>();
        generate(ans,n,0,0,"");
        return ans;
    }
}