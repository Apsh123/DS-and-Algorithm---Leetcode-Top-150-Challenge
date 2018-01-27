class Solution {
    public int minDistance(String word1, String word2) {
        char[] s1 = word1.toCharArray();
        char[] s2 = word2.toCharArray();
        
        //Arrays.sort(s1);
        //Arrays.sort(s2);
        
        if(s1.length == 0)return s2.length;
        if(s2.length ==0)return s1.length;
        
        int[][] dp = new int[s1.length+1][s2.length+1];
        
        for(int i = 0; i< dp.length; i++){
            dp[i][0] = i;
        }
        for(int i = 0; i< dp[0].length; i++){
            dp[0][i] = i;
        }
        
        for(int i =1; i< dp.length; i++){
            for(int j =1; j< dp[0].length; j++){
                if(s1[i-1] != s2[j-1]){
                    dp[i][j] = min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + 1;
                }else{
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        
        return dp[dp.length-1][dp[0].length-1];
    }
    
    private int min(int a, int b, int c){
        int x = Math.min(a , b);
        int min = Math.min(x, c);
        return min;
    }
    
}