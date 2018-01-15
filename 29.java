class Solution {
    public int divide(int dividend, int divisor) {
        int sign =1;
        
        if((dividend < 0 && divisor >0) || (dividend > 0 && divisor < 0)){
            sign = -1;
        }
        long ldivisor = Math.abs((long)divisor);
        long ldividend = Math.abs((long)dividend);
        //System.out.println(ldivisor);
        //System.out.println(ldividend);
        
        if(ldivisor == 0) return Integer.MAX_VALUE;
        if(ldividend == 0 || ldividend < ldivisor) return 0;
        
        long lans = ldivide(ldividend, ldivisor);
        //System.out.println(lans);
        int ans; 
        
        if (lans > Integer.MAX_VALUE){ 
		ans = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
	    }else{
             ans = (int)(sign * lans);
        }
        
        return ans;
        
        
    }
    
    public long ldivide(long ldividend, long ldivisor){
        if (ldividend < ldivisor) return 0;
        
        long sum = ldivisor;
	    long multiple = 1;
	    while ((sum+sum) <= ldividend) {
		    sum += sum;
		    multiple += multiple;
	    }
	//Look for additional value for the multiple from the reminder (dividend - sum) recursively.
	    return multiple + ldivide(ldividend - sum, ldivisor);
    }
}