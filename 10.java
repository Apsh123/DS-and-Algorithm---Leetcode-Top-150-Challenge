class Solution {
    public boolean isMatch(String s, String p) {
        
        char[] st = s.toCharArray();
        char[] pa = p.toCharArray();
        
        boolean T[][] = new boolean[st.length + 1][pa.length + 1];

        
        
        T[0][0] = true;
        
        for (int i =1; i < T[0].length; i++){
            if(pa[i-1] == '*'){
                T[0][i] = T[0][i-2];
            }
        
        }
        
        for(int i =1; i < T.length; i++){
            for(int j =1; j< T[0].length; j++ ){
                if(pa[j-1] == st[i-1] || pa[j-1] == '.'){
                    T[i][j] = T[i-1][j-1];
                }else if(pa[j-1] == '*'){
                    T[i][j] = T[i][j-2];
                    if(st[i-1] == pa[j-2] || pa[j-2] == '.'){
                        T[i][j] = T[i-1][j] || T[i][j-1] || T[i][j-2];
                    }
                }else {
                    T[i][j] = false;
                }
            }
        }
        
        return T[st.length][pa.length];
    }
}