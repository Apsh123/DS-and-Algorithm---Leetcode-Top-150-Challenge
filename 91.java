class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(n ==0)return 0;
        int[] ans = new int[n+1];
        ans[n] = 1;
        ans[n-1] = s.charAt(n-1) == '0'? 0:1;
        
        for(int i =n-2; i>= 0; i--){
            if(s.charAt(i) == '0')ans[i] = 0;
            else ans[i] = (Integer.parseInt(s.substring(i,i+2)) <= 26) ? ans[i+1] + ans[i+2] : ans[i+1];
        }
        return ans[0];
    }
}