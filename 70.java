class Solution {
    public int climbStairs(int n) {
     
        if(n <= 0) return 0;
        if(n == 1)return 1;
        if(n == 2)return 2;
        
        int one_Step =2;
        int two_Step =1;
        int total =0;
        
        for(int i = 3; i<= n ;i++){
            
            total = one_Step + two_Step;
            two_Step =total - two_Step;
            one_Step = total;
            
        }
        
        return total;
        
    }
}