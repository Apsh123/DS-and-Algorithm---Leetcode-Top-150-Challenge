class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new LinkedList<Integer>();
        for(int i =1; i<=n; i++){
            list.add(i);
        }
        int[] fact = new int[n+1];
        fact[0] =1;
        int sum =1;
        for(int i =1; i<=n ; i++){
            sum *= i;
            fact[i] = sum;
        }
        k--;
        StringBuilder sb = new StringBuilder();
        for(int i =1; i <= n ; i++){
            int index = k/fact[n-i];
            sb.append(String.valueOf(list.get(index)));
            list.remove(index);
            k = k-(index)*fact[n-i];
        }
        
        return sb.toString();
       
    }
}