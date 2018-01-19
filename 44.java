class Solution {
    public boolean isMatch(String s, String p) {
        char[] str = s.toCharArray();
        char[] pat = p.toCharArray();
        
        //if(str.length == 0 && pat.length ==0) return true;
        
        boolean isFirst = true;
        int index =0;
        for(int i=0; i< pat.length; i++){
            
            if(pat[i] == '*'){
                if(isFirst){
                    pat[index++] = pat[i];
                    isFirst = false;
                }
            }else{
                pat[index++] = pat[i];
                isFirst = true;
            }
        }
        
        boolean[][] dp = new boolean[str.length +1][index +1];
        
        dp[0][0] = true;
        
        if(index >0 && pat[0] == '*'){
            dp[0][1] = true;
        }
        
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j< dp[0].length; j++){
                if(str[i-1] == pat[j-1] || pat[j-1] == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(pat[j-1] == '*'){
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                } 
            }
        }
        
        return dp[str.length][index];
        
    }
}