class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        
        int n = strs[0].length();
        for(String s: strs){
            if(n>s.length()){
                n = s.length();
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<n; i++){
            char p = '-';
            for(String s: strs){
                if(p!='-'){
                    if(p!=s.charAt(i)){
                        return sb.toString();
                    }
                }
                else{
                    p = s.charAt(i);
                }
            }
            sb.append(p);
        }

        return sb.toString();


    }
}