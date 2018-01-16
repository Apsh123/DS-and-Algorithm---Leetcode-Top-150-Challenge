class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Integer> st = new Stack<Integer>();
        int n = s.length();
        for(int i =0; i < n; i ++){
            if(s.charAt(i) == '(')st.push(i);
            else {
                if (!st.isEmpty()) {
                    if (s.charAt(st.peek()) == '(') st.pop();
                    else st.push(i);
                }
                else st.push(i);
        }
        }
        int max =0;
        if(st.isEmpty()) max = n;
        else{
            int a = n, b =0;
            while(!st.isEmpty()){
            b = st.pop();
            max = Math.max(max, a-b-1);
            a = b;
        }
            max = Math.max(max, a);
        }
        
        return max;
    }
}