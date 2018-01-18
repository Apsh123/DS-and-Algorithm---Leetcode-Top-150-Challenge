class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        int[] p = new int[m+n];
        int sum =0;
        
        for(int i=n-1; i>=0; i--)
        {
            for(int j=m-1; j>=0; j--)
            {
                int mul =  (num1.charAt(i) -'0') * (num2.charAt(j)-'0');
                int p1 = i+j, p2 = i+j+1;
                sum = mul + p[p2];
                p[p1] = p[p1]+ sum/10;
                p[p2] = (sum)%10;
                
            }
        }
        System.out.print(Arrays.toString(p));
        
        StringBuilder s = new StringBuilder();
        for(int i: p)
        {
            if(!(s.length()==0 && i==0)) 
                s.append(i);
                     
        }
        return s.length()==0?"0" : s.toString();
        
    }
}