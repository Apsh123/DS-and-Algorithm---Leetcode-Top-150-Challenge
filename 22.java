class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> list = new ArrayList<String>();
        func(list,"",0,0,n);
        return list;
    }
        
       public void func(List<String> list, String str, int open, int close, int n)
        {
        if (str.length() == 2*n)
           {
            list.add(str);
            return;
           }
           
            if(open < n)
            {
                func(list, str +"(", open+1, close, n);
            }
            if(close < open)
            {
                func(list, str + ")", open, close+1,n);
            }
        }
        
        
    
}