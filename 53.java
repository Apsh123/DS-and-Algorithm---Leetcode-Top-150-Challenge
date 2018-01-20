class Solution {
    public int maxSubArray(int[] nums) {
        
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        int max = ans[0];
        for(int i =1 ; i < nums.length; i++){
            ans[i] = nums[i] + (ans[i-1] > 0 ? ans[i-1]:0);
            max = Math.max(max, ans[i]);
        }
        return max;
    }
}