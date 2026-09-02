class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean lc=false;
        boolean uc=false;
        boolean di=false;
        boolean spl_ch=false;
        char last='\0';
        if(password.length()<8){
            return false;
        }
        for(int i=0;i<password.length();i++){
            char c = password.charAt(i);
            if(c==last){
                return false;
            }
            if(Character.isDigit(c)){
                di=true;
            }
            else if(Character.isUpperCase(c)){
                uc=true;
            }
            else if(Character.isLowerCase(c)){
                lc=true;
            }
            else if(!Character.isLetterOrDigit(c)){
                spl_ch=true;
            }
            last=c;
        }
        if(uc&&lc&&di&&spl_ch){
            return true;
        }
        return false;
    }
}